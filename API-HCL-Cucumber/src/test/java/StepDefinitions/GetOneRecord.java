//
//package StepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
//public class GetOneRecord {
//
//    private Response getResponse;
//
//    @Given("I send the GET request with endpoint {string}")
//    public void i_send_the_get_request_with_endpoint(String endpoint) {
//        String objectId = "ff80818191971aa8019197b3a64f0190"; // Example ID
//        String finalEndpoint = endpoint.replace("{ID1}", objectId);
//        getResponse = RestAssured.given().get(finalEndpoint);
//    }
//
//    @Then("I should receive a GET response with status code {int}")
//    public void i_should_receive_a_get_response_with_status_code(Integer statusCode) {
//        if (getResponse == null) {
//            throw new IllegalStateException("GET response is not initialized.");
//        }
//        getResponse.then().statusCode(statusCode);
//    }
//
//    @Then("I should print the GET response body")
//    public void i_should_print_the_get_response_body() {
//        if (getResponse == null) {
//            throw new IllegalStateException("GET response is not initialized.");
//        }
//        System.out.println("GET Response Body: " + getResponse.getBody().asString());
//    }
//}












//package StepDefinitions;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import static io.restassured.RestAssured.*;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GetOneRecord {
//
//    private Response response;
//    private String baseUrl = "https://api.restful-api.dev/objects";
//    private String id;
//
//    @Given("I have a valid object ID")
//    public void i_have_a_valid_object_id() {
//        // Assume the ID was stored from a previous step
//        id = "ff80818191987533019198c3d03b00fb"; // Replace with the actual logic to retrieve the ID
//    }
//
//    @When("I send the GET request with endpoint {string}")
//    public void i_send_the_get_request_with_endpoint(String endpoint) {
//        // Replace {ID1} with the actual ID
//        endpoint = endpoint.replace("{ID1}", id);
//        
//        // Send the GET request
//        response = given().get(endpoint);
//    }
//
//    @Then("I should receive a response with status code {int}")
//    public void i_should_receive_a_response_with_status_code(int statusCode) {
//        response.then().statusCode(statusCode);
//        
////        System.out.println("Status Code: " + statusCode);
//    }
//
//    @Then("I should print the response body")
//    public void i_should_print_the_response_body() {
//        System.out.println(response.getBody().asString());
//    }
//}
