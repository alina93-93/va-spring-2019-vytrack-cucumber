Feature: Login different types of users


  Scenario Outline: Login as different users
    Given I login as a "<user>"
    When I logout
    Then the page title should be "Login"

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |


  Scenario Outline: Login as different users again
    Given I login as a <user>
    When I logout
    Then the page title should be "Login"

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |





