@smoke
  Feature: User could Filter with color

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1test251@example.com" and Password "P@ssw0rd"
      When user clicks on login button

    #Scenario SC7
    Scenario:  Logged user could filter with color
    Given user select Apparel and go to sub category Shoes
      Then user select color red from CheckBox
      Then filter option view results






