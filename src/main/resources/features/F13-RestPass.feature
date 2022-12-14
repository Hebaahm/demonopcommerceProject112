
@smoke
Feature: Customer Could Rest Password

  Background: Open Browser and Navigate to Page


  # Scenario SC3
  Scenario:  User could reset his/her password successfully
    Given user go to login page
    Then user clicks on Forget password Link
    Then user enter email "1test251@example.com"
    When user clicks on Recover button
    Then Success massage appears in green on screen


