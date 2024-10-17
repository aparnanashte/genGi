package com.bug.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretVersionName;
import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.ResponseHandler;

@SpringBootApplication
public class BugkApiApplication {
	public static void main(String[] args) {
		String projectId = "glb-fs-wgh-app-dev";
		String secretName = "github-token-fs-4-19-new";
		String location = "europe-west3";
		String modelName = "gemini-1.5-flash-001";
		String textPrompt = args[0];
		String workingDir = System.getProperty("user.dir");
		System.out.println("Current Directory" + workingDir);
		String repoUrl = "https://github.com/aparnanashte/genGi.git"; 

		// Access Secret Manager
		SecretManagerServiceClient client = null;
		try {
			client = SecretManagerServiceClient.create();
			SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretName, "latest");
			String accessToken = client.accessSecretVersion(secretVersionName).getPayload().getData().toStringUtf8();
			System.out.println("accessToken: " + accessToken);
			CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider("aparnanashte@gmail.com",
					accessToken);

			File localDir = new File(workingDir);
			Git git = null;

			if (localDir.exists() && localDir.isDirectory()) {
				git = Git.open(localDir);
				git.pull().call();
				System.out.println("Pulled the latest changes.");

			} else {
				git = Git.cloneRepository().setURI(repoUrl).setDirectory(new File(workingDir))
						.setCredentialsProvider(credentialsProvider).call();

				System.out.println("Cloned repository to: " + git.getRepository().getDirectory());

			}

			List<String> fieNames = FileFinder.findJavaFiles(workingDir);
			String testfileName = null;
			for (String name : fieNames) {
				String name1 = name.substring(name.lastIndexOf("/"), name.lastIndexOf("."));

				textPrompt = "Genrate Junit Test case for " + name1 + "class along with import statement";
				testfileName = workingDir + "/" + name1 + "Test.java";

				try (FileWriter writer = new FileWriter(testfileName)) {

					writer.write(textInput(projectId, location, modelName, textPrompt));
					System.out.println("File created successfully: " + testfileName);
				} catch (IOException e) {
					System.out.println("An error occurred while creating the file: " + e.getMessage());
				}

			}

			git.add().addFilepattern(".").call();
			git.commit().setMessage("Commit messag2222").call();
			git.push().setCredentialsProvider(credentialsProvider).call();
			git.close();
		} catch (GitAPIException | IOException e) {
			e.printStackTrace();
		}
	}

	public static String textInput(String projectId, String location, String modelName, String textPrompt)
			throws IOException {
		try (VertexAI vertexAI = new VertexAI(projectId, location)) {
			GenerativeModel model = new GenerativeModel(modelName, vertexAI);

			GenerateContentResponse response = model.generateContent(textPrompt);
			String output = ResponseHandler.getText(response);
			return output;
		}
	}
}
