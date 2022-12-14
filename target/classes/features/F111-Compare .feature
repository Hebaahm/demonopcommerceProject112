@smoke

  Feature: Logged user could add different products to compare list

    Background: Open Browser and Navigate to Page
      Given user go to login page
      Then user enter email "1test251@example.com" and Password "P@ssw0rd"
      When user clicks on login button


      #Scenario: SC11
    Scenario:  Logged user could add different products to compare list
      Given user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One M-8
      Then user add mobile to compare list
      Then user go to Electronics category
      And user select Cell phones Subcategory
      Then user select Mobile HTC One Mini Blue
      Then user go to Compare Page



