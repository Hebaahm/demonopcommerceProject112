@smoke

Feature: Change Products Currencies
 Background: Open Browser and Navigate to Page
  Given user go to login page
  Then user enter email "1test251@example.com" and Password "P@ssw0rd"
  When user clicks on login button

  #Scenario SC5
  Scenario:  Logged User could switch between currencies US-Euro
   Given user clicks on currencies list and select euro
   Then user can see € sign in products




