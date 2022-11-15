@smoke @Regression
Feature: Library app login feature
  User Story:
  As a user ,I should be able to login with correct credent dashboard should be displayed.

  Accounts here: librarian, student, admin

  Background: For the scenarios is the feature, user is expected to be on login page
    Given user is on the library login page
    Then user should see dashboard

  Scenario: Login as a librarian
    //Given user is on the library login page
    When user enters library user names
    And user enters librarian password
    #Then user should see dashboard


    Scenario: Login as a student
    //  Given user is on the library login page
      When user enters student username
      And user enters student password
    #Then user should see dashboard


  Scenario: Login as a admin
    //Given user is on the library login page
    When user enters admin username
    And user enters admin password
    #Then user should see dashboard