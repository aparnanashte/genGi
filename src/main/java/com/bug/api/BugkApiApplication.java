package com.bug.api;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BugkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugkApiApplication.class, args);
		/* String projectId = "glb-fs-wgh-app-dev";
		    String location = "europe-west3";
		    String modelName = "gemini-1.5-flash-001";
		    String textPrompt =args[0];
		        

		    String output = null;
			try {
				output = textInput(projectId, location, modelName, textPrompt);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(output);
		    
		    
		    String gitRepoUrl = "https://github.com/your-username/your-repo.git";
	        String username = "apa";
	        String password = "your_password";
	        String commitMessage = "Generated code using Gemini Flash";

	        GitRepositoryConnector.cloneRepository(gitRepoUrl, username, password);

	        // Generate code using Gemini Flash
	        String generatedCode =textInput(projectId, location, modelName, textPrompt);

	        String repositoryPath = gitRepoUrl;

	        String remoteRepositoryUrl = "https://your-username@github.com/your-repo.git";

	        // Open the local Git repository (if it exists) or create a new one
	        Repository repository = Git.open(new File(".git")).getRepository();

	        // Configure the remote repository
	      //  repository.config().setString("remote.origin.url", remoteRepositoryUrl);

	        // Set credentials provider (if required)
	        CredentialsProvider credentialsProvider = new UsernamePasswordCredentialsProvider("your-username", "your-password");
	        repository.setC;

	        // Fetch changes from the remote repository
	        repository.fetch().setCredentialsProvider(credentialsProvider).call();

	        // Pull changes from the remote repository
	        repository.pull().setCredentialsProvider(credentialsProvider).call();

	        // Push local changes to the remote repository
	        repository.push().setCredentialsProvider(credentialsProvider).call();

	        // Close the repository
	        repository.close();

	        // Create a RevWalk to iterate over commits
	        RevWalk revWalk = new RevWalk(repository);

	        // Get the latest commit
	        RevCommit latestCommit = revWalk.parseCommit(repository.resolve("HEAD"));

	        // Print commit message and author
	        System.out.println("Latest commit message: " + latestCommit.getFullMessage());
	        System.out.println("Latest commit author: " + latestCommit.getAuthor().getName());

	        // Get a list of changed files since the latest commit
	        List<String> changedFiles = repository.diff().setOldTree(latestCommit.getTree()).call().getChangedFiles();

	        // Print changed files
	        System.out.println("Changed files:");
	        for (String file : changedFiles) {
	            System.out.println("  " + file);
	        }

	        // Add newly added files to the staging area
	        for (String file : changedFiles) {
	            repository.add().addFilepattern(file).call();
	        }

	        // Commit the changes
	        repository.commit().setMessage("Committing newly added code").call();

	        // Close the repository
	        repository.close();
	    }
		    
		  }


		  // Passes the provided text input to the Gemini model and returns the text-only response.
		  // For the specified textPrompt, the model returns a list of possible store names.
		  public static String textInput(
		      String projectId, String location, String modelName, String textPrompt) throws IOException {
		    // Initialize client that will be used to send requests. This client only needs
		    // to be created once, and can be reused for multiple requests.
		    try (VertexAI vertexAI = new VertexAI(projectId, location)) {
		      GenerativeModel model = new GenerativeModel(modelName, vertexAI);

		      GenerateContentResponse response = model.generateContent(textPrompt);
		      String output = ResponseHandler.getText(response);
		      return output;
		    }
		  }
	
*/
		 String workingDir = System.getProperty("user.dir");
    	           System.out.println("Current Directory" + workingDir);
		 String repoUrl = "https://github.com/manishahande/myRepo.git"; // Replace with the public repo URL
	        String localPath = "C:\\Users\\w124642\\OneDrive - Worldline\\Documents\\temp"; // Local directory to clone into
	        String filename = "MyJavaCICDTest.java"; // Name of the file to read after cloning
	 
	        try {
	            // Clone the repository
	            Git git = Git.cloneRepository()
	                    .setURI(repoUrl)
	                    .setDirectory(new File(workingDir))
	                    .call();
	 
	            System.out.println("Cloned repository to: " + git.getRepository().getDirectory());
	 
	            // Read the specific file from the cloned repo
	            String filePath = workingDir + "/" + filename;
	            String content = new String(Files.readAllBytes(Paths.get(filePath)));
	            System.out.println("File content:\n" + content);

	String testfileName = "hello.txt";
        String filecontent = "Hello, World!";

        try (FileWriter writer = new FileWriter(testfileName)) {
            writer.write(filecontent);
            System.out.println("File created successfully: " + testfileName);
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
			
		System.out.println("File path:\n" + filePath);
		
		git.commit().setMessage("Test file commit").call();
		
		git.push().call();
		
	 
	        } catch (GitAPIException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
