Feature:

  @wip
  Scenario: View per page options
    Given I login as a "sales manager"
    And I navigate to "Activities" "Calendar Events"
    When I click on the View per page dropdown
    Then follow view per page options should be visible
      | 10  |
      | 25  |
      | 50  |
      | 100 |

@wip
  Scenario: Activities table headers
    Given I login as a "sales manager"
    When I navigate to "Activities" "Calendar Events"
    Then table should have the following headers
      | TITTLE            |
      | CALENDAR          |
      | START             |
      | END               |
      | RECURRENT         |
      | RECURRENCE        |
      | INVITATION STATUS |

    ##########
#    Then contacts table should have the following contacts
#    |Mariam |	Brackstone |	mbrackstone9@example.com|

