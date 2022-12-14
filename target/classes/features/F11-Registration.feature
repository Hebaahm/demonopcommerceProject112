
@smoke
Feature: Customer Registration

  Background: Open Browser and Navigate to Page

  # Scenario SC1
  Scenario: User could register with valid data
    Given user go to register page
    Then user select gender type
    And user enter first name "Example1" and last name "Example2"
    Then user enter date of birth
    Then user enter email "1test251@example.com" field and company name and check options
    And user enter Password fields "P@ssw0rd" "P@ssw0rd"
    Then user clicks on register button
    Then success message is displayed in Screen


