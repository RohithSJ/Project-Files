//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.junit.Assert;
//import Pojo.*;
//
//import java.util.Arrays;
//
//public class PostRequestSteps {
//
//    private RequestPayload requestPayload;
//    private Response response;
//    private String id;
//
//    @Given("I have the request payload to create a new object")
//    public void i_have_the_request_payload_to_create_a_new_object() {
//        DeviceType device1 = new DeviceType();
//        device1.setRAM("64 GB");
//        device1.setPrice(59999.99);
//        device1.setColour(Arrays.asList("Red", "Black", "Brown"));
//
//        DeviceType device2 = new DeviceType();
//        device2.setRAM("128 GB");
//        device2.setPrice(69999.99);
//        device2.setColour(Arrays.asList("Red", "Black"));
//
//        Data data = new Data();
//        data.setYear(2022);
//        data.setDevicetype(Arrays.asList(device1, device2));
//
//        requestPayload = new RequestPayload();
//        requestPayload.setName("Microsoft Pixel 6 Pro");
//        requestPayload.setData(data);
//
//        System.out.println("Request Body: " + requestPayload);
//    }
//
//    @When("I send a POST request to {string}")
//    public void i_send_a_post_request_to(String url) {
//        RestAssured.baseURI = url;
//
//        RequestSpecification request = RestAssured.given()
//            .header("Content-Type", "application/json")
//            .body(requestPayload);
//
//        response = request.post();
//    }
//
//    @Then("I should receive a response with status code {int}")
//    public void i_should_receive_a_response_with_status_code(Integer expectedStatusCode) {
//        int actualStatusCode = response.getStatusCode(); // Replace with your actual method to get the response status
//        Assert.assertEquals("Expected status code does not match", expectedStatusCode.intValue(), actualStatusCode);
//    }
//
//
//
//    @Then("the response status should be {string}")
//    public void the_response_status_should_be(String expectedStatus) {
//        String actualStatusLine = response.getStatusLine();
//        
//        if (expectedStatus.equals("Created")) {
//            Assert.assertTrue("Unexpected status: " + actualStatusLine, actualStatusLine.contains("Created") || actualStatusLine.contains("OK"));
//        } else {
//            Assert.assertTrue("Unexpected status: " + actualStatusLine, actualStatusLine.contains(expectedStatus));
//        }
//    }
//
//    @Then("the response body should contain the name {string}")
//    public void the_response_body_should_contain_the_name(String name) {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        Assert.assertEquals(name, responsePayload.getName());
//    }
//
//    @Then("I store the id from the response")
//    public void i_store_the_id_from_the_response() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        id = responsePayload.getId();
//        System.out.println("Stored ID: " + id);
//    }
//}




//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.junit.Assert;
//import Pojo.*;
//
//import java.util.Arrays;
//
//public class PostRequestSteps {
//
//    private RequestPayload requestPayload;
//    private Response response;
//    private String id;
//
//    @Given("I have the request payload to create a new object")
//    public void i_have_the_request_payload_to_create_a_new_object() {
//        DeviceType device1 = new DeviceType();
//        device1.setRAM("64 GB");
//        device1.setPrice(59999.99);
//        device1.setColour(Arrays.asList("Red", "Black", "Brown"));
//
//        DeviceType device2 = new DeviceType();
//        device2.setRAM("128 GB");
//        device2.setPrice(69999.99);
//        device2.setColour(Arrays.asList("Red", "Black"));
//
//        Data data = new Data();
//        data.setYear(2022);
//        data.setDevicetype(Arrays.asList(device1, device2));
//
//        requestPayload = new RequestPayload();
//        requestPayload.setName("Microsoft Pixel 6 Pro");
//        requestPayload.setData(data);
//
//        System.out.println("Request Body: " + requestPayload);
//    }
//
//    @When("I send a POST request to {string}")
//    public void i_send_a_post_request_to(String url) {
//        RestAssured.baseURI = url;
//
//        RequestSpecification request = RestAssured.given()
//            .header("Content-Type", "application/json")
//            .body(requestPayload);
//
//        response = request.post();
//        
//        // Debugging output for response details
//        System.out.println("Response Status Code: " + response.getStatusCode());
//        System.out.println("Response Status Line: " + response.getStatusLine());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//
//    @Then("I should receive a response with status code {int}")
//    public void i_should_receive_a_response_with_status_code(Integer expectedStatusCode) {
//        int actualStatusCode = response.getStatusCode();
//        Assert.assertEquals("Expected status code does not match", expectedStatusCode.intValue(), actualStatusCode);
//    }
//
//    @Then("the response status should be {string}")
//    public void the_response_status_should_be(String expectedStatus) {
//        // Extract the actual status line from the response
//        String actualStatusLine = response.getStatusLine();
//        
//        // Debugging output for better clarity
//        System.out.println("Actual status line: " + actualStatusLine);
//        
//        // Check if the actual status line contains the expected status
//        boolean statusMatches = actualStatusLine.contains(expectedStatus);
//
//        // Fail the test if the expected status is not part of the actual status line
//        Assert.assertTrue("Unexpected status: " + actualStatusLine, statusMatches);
//    }
//
//    
//
//    @Then("the response body should contain the name {string}")
//    public void the_response_body_should_contain_the_name(String name) {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        Assert.assertEquals(name, responsePayload.getName());
//    }
//
//    @Then("I store the id from the response")
//    public void i_store_the_id_from_the_response() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        id = responsePayload.getId();
//        System.out.println("Stored ID: " + id);
//    }
//    
//    
//}













//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.junit.Assert;
//import Pojo.*;
//
//import java.util.Arrays;
//
//public class PostRequestSteps {
//
//    private RequestPayload requestPayload;
//    private Response response;
//    private String id;
//
//    @Given("I have the request payload to create a new object")
//    public void i_have_the_request_payload_to_create_a_new_object() {
//        DeviceType device1 = new DeviceType();
//        device1.setRAM("64 GB");
//        device1.setPrice(59999.99);
//        device1.setColour(Arrays.asList("Red", "Black", "Brown"));
//
//        DeviceType device2 = new DeviceType();
//        device2.setRAM("128 GB");
//        device2.setPrice(69999.99);
//        device2.setColour(Arrays.asList("Red", "Black"));
//
//        Data data = new Data();
//        data.setYear(2022);
//        data.setDevicetype(Arrays.asList(device1, device2));
//
//        requestPayload = new RequestPayload();
//        requestPayload.setName("Microsoft Pixel 6 Pro");
//        requestPayload.setData(data);
//
//        System.out.println("Request Body: " + requestPayload);
//    }
//
//    @When("I send a POST request to {string}")
//    public void i_send_a_post_request_to(String url) {
//        RestAssured.baseURI = url;
//
//        RequestSpecification request = RestAssured.given()
//            .header("Content-Type", "application/json")
//            .body(requestPayload);
//
//        response = request.post();
//        
//        // Debugging output
//        System.out.println("Response Status Line: " + response.getStatusLine());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//
//    
//    
//    
//    
//    @Then("I should receive a response with status code {int}")
//    public void i_should_receive_a_response_with_status_code(Integer expectedStatusCode) {
//        int actualStatusCode = response.getStatusCode();
//        
//        // Debugging output
//        System.out.println("Response Status Code: " + actualStatusCode);
//        
//        Assert.assertEquals("Expected status code does not match", expectedStatusCode.intValue(), actualStatusCode);
//    }
//    
//    
//    
//    
//    
//
//    @And("the response status should be {string}")
//    public void the_response_status_should_be(String expectedStatus) {
//        String actualStatusLine = response.getStatusLine();
//
//        // Debugging output
//        System.out.println("Actual Status Line: " + actualStatusLine);
//        
//        // Adjusting the expected status comparison to be more flexible
//        String expectedStatusLine = "HTTP/1.1 " + expectedStatus;
//        
//        // Check if actual status contains expected status string
//        Assert.assertTrue("Unexpected status: " + actualStatusLine,
//                actualStatusLine.equalsIgnoreCase(expectedStatusLine) ||
//                actualStatusLine.contains(expectedStatus));
//    }
//
//    
//    
//    
//
//    @And("the response body should contain the name {string}")
//    public void the_response_body_should_contain_the_name(String name) {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        Assert.assertEquals(name, responsePayload.getName());
//    }
//    
//   
//  
//    
//    
//
//    @And("I store the id from the response")
//    public void i_store_the_id_from_the_response() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        id = responsePayload.getId();
//        System.out.println("Stored ID: " + id);
//    }
//}
//
//






package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import Pojo.*;

import java.util.Arrays;

public class PostRequestSteps {

    private RequestPayload requestPayload;
    private Response response;
    private String id;

    @Given("I have the request payload to create a new object")
    public void i_have_the_request_payload_to_create_a_new_object() {
        // Create the request payload
        DeviceType device1 = new DeviceType();
        device1.setRAM("64 GB");
        device1.setPrice(59999.99);
        device1.setColour(Arrays.asList("Red", "Black", "Brown"));

        DeviceType device2 = new DeviceType();
        device2.setRAM("128 GB");
        device2.setPrice(69999.99);
        device2.setColour(Arrays.asList("Red", "Black"));

        Data data = new Data();
        data.setYear(2022);
        data.setDevicetype(Arrays.asList(device1, device2));

        requestPayload = new RequestPayload();
        requestPayload.setName("Microsoft Pixel 6 Pro");
        requestPayload.setData(data);

        System.out.println("Request Body: " + requestPayload);
    }

    @When("I send a POST request to {string}")
    public void i_send_a_post_request_to(String url) {
        // Send the POST request
        RestAssured.baseURI = url;

        RequestSpecification request = RestAssured.given()
            .header("Content-Type", "application/json")
            .body(requestPayload);

        response = request.post();
        
        // Debugging output
        System.out.println("Response Status Line: " + response.getStatusLine());
        System.out.println("Response Body: " + response.getBody().asString());
    }

    @Then("I should receive a response with status code {int}")
    public void i_should_receive_a_response_with_status_code(Integer expectedStatusCode) {
        // Verify the response status code
        int actualStatusCode = response.getStatusCode();
        
        // Debugging output
        System.out.println("Response Status Code: " + actualStatusCode);
        
        Assert.assertEquals("Expected status code does not match", expectedStatusCode.intValue(), actualStatusCode);
    }

    @Then("the response status should be {string}")
    public void the_response_status_should_be(String expectedStatus) {
        // Verify the response status
        String actualStatusLine = response.getStatusLine();

        // Debugging output
        System.out.println("Actual Status Line: " + actualStatusLine);
        
        String expectedStatusLine = "HTTP/1.1 " + expectedStatus;
        
        Assert.assertTrue("Unexpected status: " + actualStatusLine,
                actualStatusLine.equalsIgnoreCase(expectedStatusLine) ||
                actualStatusLine.contains(expectedStatus));
    }

    @Then("the response body should contain the name {string}")
    public void the_response_body_should_contain_the_name(String name) {
        // Verify the response body contains the expected name
        ResponsePayload responsePayload = response.as(ResponsePayload.class);
        Assert.assertEquals(name, responsePayload.getName());
    }

    @Then("I store the id from the response")
    public void i_store_the_id_from_the_response() {
        // Store the ID from the response
        ResponsePayload responsePayload = response.as(ResponsePayload.class);
        id = responsePayload.getId();
        System.out.println("Stored ID: " + id);
    }
}













