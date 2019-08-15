Feature: User account information

  @wip
  Scenario: test with manager
    Given I login as a driver
    And I navigate to "Custumer" "Contacts"
    When I click on custumer with email "sheers2@surveymonkey.com"
    Then custumer email should be "sheers2@surveymonkey.com" in the account page
