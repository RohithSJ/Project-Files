package APITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Testing1 {
	
	 @BeforeClass
	    public void setup() {
	        // Set the base URL for the API
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	    }

	    @Test
	    public void testGetUser() {
	        // Create a request specification
	        RequestSpecification request = RestAssured.given();

	        // Send a GET request to the /users endpoint
	        Response response = request.get("/users/1");

	        // Print response to console
	        response.prettyPrint();

	        // Assert the status code
	        Assert.assertEquals(response.getStatusCode(), 200, "Status code is not 200");

	        // Assert the response content
	        String name = response.jsonPath().getString("name");
	        Assert.assertEquals(name, "Leanne Graham", "Name does not match");
	    }

	    @Test
	    public void testCreateUser() {
	        // Create a request specification
	        RequestSpecification request = RestAssured.given();

	        // Set the content type to JSON
	        request.header("Content-Type", "application/json");

	        // Create a JSON object for the request body
	        String requestBody = "{\n" +
	                "  \"name\": \"John Doe\",\n" +
	                "  \"username\": \"johndoe\",\n" +
	                "  \"email\": \"johndoe@example.com\"\n" +
	                "}";

	        // Send a POST request to the /users endpoint
	        Response response = request.body(requestBody).post("/users");

	        // Print response to console
	        response.prettyPrint();

	        // Assert the status code
	        Assert.assertEquals(response.getStatusCode(), 201, "Status code is not 201");

	        // Assert the response content
	        String name = response.jsonPath().getString("name");
	        Assert.assertEquals(name, "John Doe", "Name does not match");
	        
	        
	        System.out.println("Response code:"  + response.getStatusCode());
	        
	    }

}
