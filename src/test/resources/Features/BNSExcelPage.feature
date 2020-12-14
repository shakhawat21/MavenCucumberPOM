Feature: BNS login form fillup webpage
  As a user he wants to create new account in BNS webpage

  @BNSExcel
  Scenario Outline: Creating account in BNS webpage by excel data
    Given User is on BNS login webpage
    When User will enter and click and select "<Row_index>"
    And User click on submit button
    Then User should create new account successfully"

    Examples: 
      | Row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
