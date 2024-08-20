#Feature: Google Homepage Check
#
  #Scenario: Open Google Homepage
    #Given I open the Google homepage
    #When I search for "sai"
    #Then I should see the results related to "sai"

    
    
    
    Feature: Google Search Functionality

  Scenario Outline: Search on Google with different keywords
    Given I open the Google homepage
    When I search for "<keyword>"
    Then I should see the results related to "<keyword>"

    Scenarios:
      | keyword  |
      | Cucumber |
      | Java     |
      | Selenium |
      | BDD      |
    