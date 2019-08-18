Feature:

  Scenario Outline: verify page titles
    Given I login as a "<user>"

    Examples:
      | user          |
      | driver        |
      | sales manager |
      | sales manager |
      | sales manager |
      | sales manager |

# THIS WILL FAIL
  Scenario Outline: verify page titles
    And I click on customer with email "<email>"

    Examples:
      | email         |
      | ccnc@mail.com |
      | ccnc@mail.com |
      | ccnc@mail.com |