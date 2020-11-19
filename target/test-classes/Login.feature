Feature: Validating login functionality of facebook application

  Scenario Outline: validating FB with invalid username and password
    Given user is on  facebook
    When user is going to enter "<username>" and "<password>"
    And user should click login button
    Then user should verfiy by seeing the home page

    Examples: 
      | username | password |
      | sql      | java     |
      | java     | sql      |
      | python   | java     |
      | java     | python   |
