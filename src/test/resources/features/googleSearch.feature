Feature: Google search functionality
  User Story: As a user, when I am on the google search page
  I should be abel to search whatever I want and ese relevant information


  Scenario: Search functionality result title verification
    Given user is on Google page
    When user types apple in the google search box and click enter
    Then user sees apple - Google Search is in the google title



  Scenario: Search functionality result title verification
    Given user is on Google page
    When user types "tesla" in the google search box and click enter
    Then user sees "tesla - Google Search" is in the google title