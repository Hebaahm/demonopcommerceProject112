@smoke
  Feature: Logged user could Select different Tags

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1test251@example.com" and Password "P@ssw0rd"
      When user clicks on login button

    #Scenario SC8
    Scenario:  Logged user could select different tags
      Given user select category Apparel
      Then user select tag name from list
      And user could select another tag

