package com.bug.api;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.ResponseHandler;

@SpringBootApplication
public class BugkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugkApiApplication.class, args);
		 String projectId = "glb-fs-wgh-app-dev";
		    String location = "europe-west3";
		    String modelName = "gemini-1.5-flash-001";
		    String textPrompt ="genrate test cases for Bug class";
		        

		    String output = null;
			try {
				output = textInput(projectId, location, modelName, textPrompt);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println(output);
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
	

}
