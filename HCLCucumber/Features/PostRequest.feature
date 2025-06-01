Feature: API Testing

  Scenario: Create and verify an object
    Given I have the request payload to create a new object
    When I send a POST request to "https://api.restful-api.dev/objects"
    Then I should receive a response with status code 200
    Then the response status should be "200"
    Then the response body should contain the name "Microsoft Pixel 6 Pro"
    Then I store the id from the response

 
 






