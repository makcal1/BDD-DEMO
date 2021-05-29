Feature: Test login functionality

  @login
  Scenario Outline: Check login is succesfull with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | Muhammed |    12345 |
      | Akcal    |    12345 |
