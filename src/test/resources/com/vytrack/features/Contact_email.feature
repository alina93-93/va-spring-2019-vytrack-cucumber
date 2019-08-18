Feature: User account information

  Background:
    Given I login as a "driver"
    And I navigate to "Customers" "Contacts"

  Scenario: test with manager
    When I click on customer with email "odugmore5@sakura.ne.jp"
    Then customer email should be "odugmore5@sakura.ne.jp" in the account page

  Scenario: test with admin user
    When I click on customer with email "mbrackstone9@example.com"
    Then customer email should be "mbrackstone9@example.com" in the account page

  Scenario: test with non admin user
    When I click on customer with email "ijenk8@amazon.co.jp"
    Then customer email should be "ijenk8@amazon.co.jp" in the account page

  Scenario: test with guest user
    When I click on customer with email "jihmsmithoglu@mail.com"
    Then customer email should be "jihmsmithoglu@mail.com" in the account page