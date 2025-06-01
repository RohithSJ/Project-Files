Feature: API Testing with REST Assured


  
  Scenario: Create and verify Microsoft Pixel 6 Pro
    Given I have the request payload to create Microsoft Pixel 6 Pro
    When I send a POST request to "https://api.restful-api.dev/objects" for Microsoft Pixel 6 Pro
    Then I should receive a response with status code 200 for Microsoft Pixel 6 Pro
    And the response body should contain the name Microsoft Pixel 6 Pro
    And I store the id from the response for Microsoft Pixel 6 Pro

  Scenario: Retrieve and validate the Microsoft Pixel 6 Pro object
    Given I have a valid object ID for Microsoft Pixel 6 Pro
    When I send the GET request with endpoint "https://api.restful-api.dev/objects/{ID1}" for Microsoft Pixel 6 Pro
    Then I should receive a response with status code 200
    And I should print the response body for Microsoft Pixel 6 Pro

  @Ignore
  Scenario: Create and verify Samsung Galaxy S21
    Given I have the request payload to create Samsung Galaxy S21
    When I send a POST request to "https://api.restful-api.dev/objects" for Samsung Galaxy S21
    Then I should receive a response with status code 200 for Samsung Galaxy S21
    And the response body should contain the name Samsung Galaxy S21
    And I store the id from the response for Samsung Galaxy S21

 @Ignore
  Scenario: Retrieve and validate the Samsung Galaxy S21 object 
    Given I have a valid object ID for Samsung Galaxy S21 
    When I send the GET request with endpoint "https://api.restful-api.dev/objects?id={ID1}&id={ID2}" for Samsung Galaxy S21 
    Then I should receive a response with status code 200
    And I should print the response body for Samsung Galaxy S21 
