package com.bug.api;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.springframework.boot.SpringApplication;
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
		String textPrompt = "Genrate Junit Test case for com.bug.api.model.domain.Bug java class along with import statement;";

		String output = null;
		try {
			output = textInput(projectId, location, modelName, textPrompt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String workingDir = System.getProperty("user.dir") ;
		System.out.println("Current Directory" + workingDir);
		String repoUrl = "https://github.com/aparnanashte/genGi.git"; // Replace with the public repo URL

		// Access Secret Manager
		SecretManagerServiceClient client = null;
		try {
			client = SecretManagerServiceClient.create();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretName, "latest");
		String accessToken = client.accessSecretVersion(secretVersionName).getPayload().getData().toStringUtf8();
		System.out.println("accessToken: " + accessToken);
		CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider("aparnanashte@gmail.com",
				accessToken);

		try {
			// Clone the repository
			Git git = Git.cloneRepository().setURI(repoUrl).setDirectory(new File(workingDir))
					.setCredentialsProvider(credentialsProvider).call();

			System.out.println("Cloned repository to: " + git.getRepository().getDirectory());

			// Read the specific file from the cloned repo

			String testfileName = workingDir + "/BugTest.java";
			String filecontent = output;

			try (FileWriter writer = new FileWriter(testfileName)) {
				writer.write(filecontent);
				System.out.println("File created successfully: " + testfileName);
			} catch (IOException e) {
				System.out.println("An error occurred while creating the file: " + e.getMessage());
			}

			
			git.add().addFilepattern(".").call();
			git.commit().setMessage("Commit messag2222").call();
			// CredentialsProvider credentialsProvider = new
			// UsernamePasswordCredentialsProvider(username, password);
			// Replace with your Secret Manager secret project ID and secret name

			// Create credentials provider

			git.push().setCredentialsProvider(credentialsProvider).call();

		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}

	public static String textInput(String projectId, String location, String modelName, String textPrompt)
			throws IOException {
		// Initialize client that will be used to send requests. This client only needs
		// to be created once, and can be reused for multiple requests.
		try (VertexAI vertexAI = new VertexAI(projectId, location)) {
			GenerativeModel model = new GenerativeModel(modelName, vertexAI);

			GenerateContentResponse response = model.generateContent(textPrompt);
			String output = ResponseHandler.getText(response);
			return output;
		}
	}

}
