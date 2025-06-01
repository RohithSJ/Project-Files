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
//public class APITestingSteps {
//
//    private RequestPayload requestPayload;
//    private Response response;
//    private static String id;
//
//    @Given("I have the request payload to create a new object")
//    public void i_have_the_request_payload_to_create_a_new_object() {
//    	@Given("I have the request payload to create a new object {string}")
//    	public void i_have_the_request_payload_to_create_a_new_object(String objectName) {
//    	    DeviceType device1 = new DeviceType();
//    	    device1.setRAM("64 GB");
//    	    device1.setPrice(59999.99);
//    	    device1.setColour(Arrays.asList("Red", "Black", "Brown"));
//
//    	    DeviceType device2 = new DeviceType();
//    	    device2.setRAM("128 GB");
//    	    device2.setPrice(69999.99);
//    	    device2.setColour(Arrays.asList("Red", "Black"));
//
//    	    Data data = new Data();
//    	    data.setYear(2022);
//    	    data.setDevicetype(Arrays.asList(device1, device2));
//
//    	    requestPayload = new RequestPayload();
//    	    requestPayload.setName(objectName);  // Use the parameter to set the object name
//    	    requestPayload.setData(data);
//
//    	    System.out.println("Request Payload: " + requestPayload);
//    	}
//
//    @When("I send a POST request to {string}")
//    public void i_send_a_post_request_to(String url) {
//        // Set base URI and send POST request
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
//    @Then("I should receive a response with status code {int}")
//    public void i_should_receive_a_response_with_status_code(int expectedStatusCode) {
//        // Verify the response status code
//        int actualStatusCode = response.getStatusCode();
//        
//        System.out.println("Response Status Code: " + actualStatusCode);
//        
//        Assert.assertEquals("Expected status code does not match", expectedStatusCode, actualStatusCode);
//    }
//
//    @Then("the response status should be {string}")
//    public void the_response_status_should_be(String expectedStatus) {
//        // Verify the response status line
//        String actualStatusLine = response.getStatusLine();
//        String expectedStatusLine = "HTTP/1.1 " + expectedStatus;
//        
//        System.out.println("Actual Status Line: " + actualStatusLine);
//        
//        Assert.assertTrue("Unexpected status: " + actualStatusLine,
//                actualStatusLine.equalsIgnoreCase(expectedStatusLine) ||
//                actualStatusLine.contains(expectedStatus));
//    }
//
//    @Then("the response body should contain the name {string}")
//    public void the_response_body_should_contain_the_name(String name) {
//        // Verify the response body contains the expected name
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        Assert.assertEquals("Expected name does not match", name, responsePayload.getName());
//    }
//
//    @Then("I store the id from the response")
//    public void i_store_the_id_from_the_response() {
//        // Store the ID from the response
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        id = responsePayload.getId();
//        System.out.println("Stored ID: " + id);
//    }
//
//    @Given("I have a valid object ID")
//    public void i_have_a_valid_object_id() {
//        // Ensure the ID is not null
//        Assert.assertNotNull("Object ID is null. Ensure the POST request was successful.", id);
//    }
//
//    @When("I send the GET request with endpoint {string}")
//    public void i_send_the_get_request_with_endpoint(String endpoint) {
//        // Replace {ID1} with the actual ID and send GET request
//        String finalEndpoint = endpoint.replace("{ID1}", id);
//        response = RestAssured.given().get(finalEndpoint);
//
//        // Debugging output
//        System.out.println("Response Status Code: " + response.getStatusCode());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//
//    @Then("I should print the response body")
//    public void i_should_print_the_response_body() {
//        // Print the response body
//        System.out.println("GET Response Body: " + response.getBody().asString());
//    }
//    
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
//public class APITestingSteps {
//
//    private RequestPayload requestPayload;
//    private Response response;
//    private static String id1;
//    private static String id2;
//
//    // Post Request 1
//    @Given("I have the request payload to create Microsoft Pixel 6 Pro")
//    public void i_have_the_request_payload_to_create_microsoft_pixel_6_pro() {
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
//        System.out.println("Request Payload: " + requestPayload);
//    }
//
//    @When("I send a POST request to {string} for Microsoft Pixel 6 Pro")
//    public void i_send_a_post_request_to_for_microsoft_pixel_6_pro(String url) {
//        RestAssured.baseURI = url;
//
//        RequestSpecification request = RestAssured.given()
//            .header("Content-Type", "application/json")
//            .body(requestPayload);
//
//        response = request.post();
//
//        System.out.println("Response Status Line: " + response.getStatusLine());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//
//    @Then("I should receive a response with status code {int} for Microsoft Pixel 6 Pro")
//    public void i_should_receive_a_response_with_status_code_for_microsoft_pixel_6_pro(int expectedStatusCode) {
//        int actualStatusCode = response.getStatusCode();
//        System.out.println("Response Status Code: " + actualStatusCode);
//        Assert.assertEquals("Expected status code does not match", expectedStatusCode, actualStatusCode);
//    }
//
//    @Then("the response body should contain the name Microsoft Pixel 6 Pro")
//    public void the_response_body_should_contain_the_name_microsoft_pixel_6_pro() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        Assert.assertEquals("Expected name does not match", "Microsoft Pixel 6 Pro", responsePayload.getName());
//    }
//
//    @Then("I store the id from the response for Microsoft Pixel 6 Pro")
//    public void i_store_the_id_from_the_response_for_microsoft_pixel_6_pro() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        id1 = responsePayload.getId();
//        System.out.println("Stored ID for Microsoft Pixel 6 Pro: " + id1);
//    }
//
//    @Given("I have a valid object ID for Microsoft Pixel 6 Pro")
//    public void i_have_a_valid_object_id_for_microsoft_pixel_6_pro() {
//        Assert.assertNotNull("Object ID is null. Ensure the POST request was successful.", id1);
//    }
//
//    @When("I send the GET request with endpoint {string} for Microsoft Pixel 6 Pro")
//    public void i_send_the_get_request_with_endpoint_for_microsoft_pixel_6_pro(String endpoint) {
//        String finalEndpoint = endpoint.replace("{ID1}", id1);
//        response = RestAssured.given().get(finalEndpoint);
//        System.out.println("Response Status Code: " + response.getStatusCode());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//
//    @Then("I should print the response body for Microsoft Pixel 6 Pro")
//    public void i_should_print_the_response_body_for_microsoft_pixel_6_pro() {
//        System.out.println("GET Response Body for Microsoft Pixel 6 Pro: " + response.getBody().asString());
//    }
//
//    // Post Request 2
//    @Given("I have the request payload to create Samsung Galaxy S21")
//    public void i_have_the_request_payload_to_create_samsung_galaxy_s21() {
//        DeviceType device1 = new DeviceType();
//        device1.setRAM("32 GB");
//        device1.setPrice(79999.99);
//        device1.setColour(Arrays.asList("Blue", "Green", "White"));
//
//        DeviceType device2 = new DeviceType();
//        device2.setRAM("64 GB");
//        device2.setPrice(89999.99);
//        device2.setColour(Arrays.asList("Orange", "Black"));
//
//        Data data = new Data();
//        data.setYear(2022);
//        data.setDevicetype(Arrays.asList(device1, device2));
//
//        requestPayload = new RequestPayload();
//        requestPayload.setName("Samsung Galaxy S21");
//        requestPayload.setData(data);
//
//        System.out.println("Request Payload: " + requestPayload);
//    }
//
//    @When("I send a POST request to {string} for Samsung Galaxy S21")
//    public void i_send_a_post_request_to_for_samsung_galaxy_s21(String url) {
//        RestAssured.baseURI = url;
//
//        RequestSpecification request = RestAssured.given()
//            .header("Content-Type", "application/json")
//            .body(requestPayload);
//
//        response = request.post();
//
//        System.out.println("Response Status Line: " + response.getStatusLine());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//
//    @Then("I should receive a response with status code {int} for Samsung Galaxy S21")
//    public void i_should_receive_a_response_with_status_code_for_samsung_galaxy_s21(int expectedStatusCode) {
//        int actualStatusCode = response.getStatusCode();
//        System.out.println("Response Status Code: " + actualStatusCode);
//        Assert.assertEquals("Expected status code does not match", expectedStatusCode, actualStatusCode);
//    }
//
//    @Then("the response body should contain the name Samsung Galaxy S21")
//    public void the_response_body_should_contain_the_name_samsung_galaxy_s21() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        Assert.assertEquals("Expected name does not match", "Samsung Galaxy S21", responsePayload.getName());
//    }
//
//    @Then("I store the id from the response for Samsung Galaxy S21")
//    public void i_store_the_id_from_the_response_for_samsung_galaxy_s21() {
//        ResponsePayload responsePayload = response.as(ResponsePayload.class);
//        id2 = responsePayload.getId();
//        System.out.println("Stored ID for Samsung Galaxy S21: " + id2);
//    }
//
//    @Given("I have a valid object ID for Samsung Galaxy S21")
//    public void i_have_a_valid_object_id_for_samsung_galaxy_s21() {
//        Assert.assertNotNull("Object ID is null. Ensure the POST request was successful.", id2);
//    }
//
//    @When("I send the GET request with endpoint {string} for Samsung Galaxy S21")
//    public void i_send_the_get_request_with_endpoint_for_samsung_galaxy_s21(String endpoint) {
//        String finalEndpoint = endpoint.replace("{ID1}", id1).replace("{ID2}", id2);
//        response = RestAssured.given().get(finalEndpoint);
//        System.out.println("Response Status Code: " + response.getStatusCode());
//        System.out.println("Response Body: " + response.getBody().asString());
//    }
//    
//   
//    
//
//    @Then("I should print the response body for Samsung Galaxy S21")
//    public void i_should_print_the_response_body_for_samsung_galaxy_s21() {
//        System.out.println("GET Response Body for Samsung Galaxy S21: " + response.getBody().asString());
//    }
//}

    




package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import Pojo.*;

import java.util.Arrays;

public class APITestingSteps {

    private RequestPayload requestPayload;
    private Response response;
    private static String id1; // ID for Microsoft Pixel 6 Pro
    private static String id2; // ID for Samsung Galaxy S21

    // Create Microsoft Pixel 6 Pro
    @Given("I have the request payload to create Microsoft Pixel 6 Pro")
    public void i_have_the_request_payload_to_create_microsoft_pixel_6_pro() {
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

        System.out.println("Request Payload: " + requestPayload);
    }
    
    
    @When("I send a POST request to {string} for Microsoft Pixel 6 Pro")
    public void i_send_a_post_request_to_for_microsoft_pixel_6_pro(String url) {
        RestAssured.baseURI = url;
        RequestSpecification request = RestAssured.given()
            .header("Content-Type", "application/json")
            .body(requestPayload);
        response = request.post();
        System.out.println("Response Status Line: " + response.getStatusLine());
        System.out.println("Response Body: " + response.getBody().asString());
    }

    @Then("I should receive a response with status code {int} for Microsoft Pixel 6 Pro")
    public void i_should_receive_a_response_with_status_code_for_microsoft_pixel_6_pro(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + actualStatusCode);
        Assert.assertEquals("Expected status code does not match", expectedStatusCode, actualStatusCode);
    }

    @Then("the response body should contain the name Microsoft Pixel 6 Pro")
    public void the_response_body_should_contain_the_name_microsoft_pixel_6_pro() {
        ResponsePayload responsePayload = response.as(ResponsePayload.class);
        Assert.assertEquals("Expected name does not match", "Microsoft Pixel 6 Pro", responsePayload.getName());
    }

    @Then("I store the id from the response for Microsoft Pixel 6 Pro")
    public void i_store_the_id_from_the_response_for_microsoft_pixel_6_pro() {
        ResponsePayload responsePayload = response.as(ResponsePayload.class);
        id1 = responsePayload.getId();
        System.out.println("Stored ID for Microsoft Pixel 6 Pro: " + id1);
    }

    @Given("I have a valid object ID for Microsoft Pixel 6 Pro")
    public void i_have_a_valid_object_id_for_microsoft_pixel_6_pro() {
        Assert.assertNotNull("Object ID is null. Ensure the POST request was successful.", id1);
    }

    @When("I send the GET request with endpoint {string} for Microsoft Pixel 6 Pro")
    public void i_send_the_get_request_with_endpoint_for_microsoft_pixel_6_pro(String endpoint) {
        String finalEndpoint = endpoint.replace("{ID1}", id1);
        response = RestAssured.given().get(finalEndpoint);
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }

    @Then("I should receive a response with status code {int}")
    public void i_should_receive_a_response_with_status_code(Integer expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + actualStatusCode);
        Assert.assertEquals("Expected status code does not match", expectedStatusCode.intValue(), actualStatusCode);
    }

    @Then("I should print the response body for Microsoft Pixel 6 Pro")
    public void i_should_print_the_response_body_for_microsoft_pixel_6_pro() {
        System.out.println("GET Response Body for Microsoft Pixel 6 Pro: " + response.getBody().asString());
    }

    // Create Samsung Galaxy S21
    @Given("I have the request payload to create Samsung Galaxy S21")
    public void i_have_the_request_payload_to_create_samsung_galaxy_s21() {
        DeviceType device1 = new DeviceType();
        device1.setRAM("32 GB");
        device1.setPrice(79999.99);
        device1.setColour(Arrays.asList("Blue", "Green", "White"));

        DeviceType device2 = new DeviceType();
        device2.setRAM("64 GB");
        device2.setPrice(89999.99);
        device2.setColour(Arrays.asList("Orange", "Black"));

        Data data = new Data();
        data.setYear(2022);
        data.setDevicetype(Arrays.asList(device1, device2));

        requestPayload = new RequestPayload();
        requestPayload.setName("Samsung Galaxy S21");
        requestPayload.setData(data);

        System.out.println("Request Payload: " + requestPayload);
    }

    @When("I send a POST request to {string} for Samsung Galaxy S21")
    public void i_send_a_post_request_to_for_samsung_galaxy_s21(String url) {
        RestAssured.baseURI = url;
        RequestSpecification request = RestAssured.given()
            .header("Content-Type", "application/json")
            .body(requestPayload);
        response = request.post();
        System.out.println("Response Status Line: " + response.getStatusLine());
        System.out.println("Response Body: " + response.getBody().asString());
    }

    @Then("I should receive a response with status code {int} for Samsung Galaxy S21")
    public void i_should_receive_a_response_with_status_code_for_samsung_galaxy_s21(int expectedStatusCode) {
        int actualStatusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + actualStatusCode);
        Assert.assertEquals("Expected status code does not match", expectedStatusCode, actualStatusCode);
    }

    @Then("the response body should contain the name Samsung Galaxy S21")
    public void the_response_body_should_contain_the_name_samsung_galaxy_s21() {
        ResponsePayload responsePayload = response.as(ResponsePayload.class);
        Assert.assertEquals("Expected name does not match", "Samsung Galaxy S21", responsePayload.getName());
    }

    @Then("I store the id from the response for Samsung Galaxy S21")
    public void i_store_the_id_from_the_response_for_samsung_galaxy_s21() {
        ResponsePayload responsePayload = response.as(ResponsePayload.class);
        id2 = responsePayload.getId();
        System.out.println("Stored ID for Samsung Galaxy S21: " + id2);
    }

    @Given("I have a valid object ID for Samsung Galaxy S21")
    public void i_have_a_valid_object_id_for_samsung_galaxy_s21() {
        Assert.assertNotNull("Object ID is null. Ensure the POST request was successful.", id2);
        Assert.assertNotNull("Object ID is null. Ensure the POST request was successful.", id2);

    }

    @When("I send the GET request with endpoint {string} for Samsung Galaxy S21")
    public void i_send_the_get_request_with_endpoint_for_samsung_galaxy_s21(String endpoint) {
     String finalEndpoint = endpoint.replace("{ID1}", id1).replace("{ID2}", id2);
        response = RestAssured.given().get(finalEndpoint);
        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }

    @Then("I should print the response body for Samsung Galaxy S21")
    public void i_should_print_the_response_body_for_samsung_galaxy_s21() {
        System.out.println("GET Response Body for Samsung Galaxy S21: " + response.getBody().asString());
    }
}







