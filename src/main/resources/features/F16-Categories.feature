@smoke
Feature: User could Select different Categories

 Background: Open Browser and Navigate to Page
  Given user go to login page
  Then user enter email "1test251@example.com" and Password "P@ssw0rd"
  When user clicks on login button



  #Scenario SC6
  Scenario:  Logged user could select different Categories
   Given user select different category tabs
   Then user select Computers and go to sub category Software
   When user clicks on currencies list and select euro
   Then user can see € sign in products
   And user select Windows-8-Pro



