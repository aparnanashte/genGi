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

@SpringBootApplication
public class BugkApiApplication {
	public static void main(String[] args) {
		
		String workingDir = System.getProperty("user.dir") + "2";
		System.out.println("Current Directory" + workingDir);
		String repoUrl = "https://github.com/aparnanashte/genGi.git"; // Replace with the public repo URL

		try {
			// Clone the repository
			Git git = Git.cloneRepository().setURI(repoUrl).setDirectory(new File(workingDir)).call();

			System.out.println("Cloned repository to: " + git.getRepository().getDirectory());

			// Read the specific file from the cloned repo

			String testfileName = workingDir + "\\hello11.txt";
			String filecontent = "Hello, World!";

			try (FileWriter writer = new FileWriter(testfileName)) {
				writer.write(filecontent);
				System.out.println("File created successfully: " + testfileName);
			} catch (IOException e) {
				System.out.println("An error occurred while creating the file: " + e.getMessage());
			}

			String username = "aparnanashte@gmail.com";
			  String projectId = "glb-fs-wgh-app-dev";
	        String secretName = "github-access-token-fs-4-19";

	        // Access Secret Manager
	        SecretManagerServiceClient client = null;
			try {
				client = SecretManagerServiceClient.create();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        SecretVersionName secretVersionName = SecretVersionName.of(projectId, secretName,"1");
	        String accessToken = client.accessSecretVersion(secretVersionName).getPayload().getData().toStringUtf8();

	        

			

			CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider(username, accessToken);

			git.push().setCredentialsProvider(credentialsProvider).call();

		} catch (GitAPIException e) {
			e.printStackTrace();
		}
	}
}
