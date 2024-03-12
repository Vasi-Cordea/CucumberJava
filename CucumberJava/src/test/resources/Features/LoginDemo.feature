Feature: Test login funstionality
  I want to use this template for my feature file

  Scenario Outline: Check login is succesfully with valid credentials
    Given Browser is  then opened
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user navigates to the homepage

    Examples: 
      | username | password    |
      | student  | Password123 |
       | student| passFail|