@FundTransfer
Feature: Fund Transfers functionalities
  As a user he wants to transfer his Fund as he wish

@ValidPayeeNoAmount
  Scenario: Valid Payee and not amount
    Given user is on Funds Transfer Webpage
    When he will select "Jim" from dropdownBox and enter "" in amount field
    When he will click on Transfer Button
    Then he should get Balance "5000.00" and message "Please enter a valid amount"

@ValidPayeeInvalidAmount
  Scenario: Valid Payee and invalid amount
    Given user is on Funds Transfer Webpage
    When he will select "Jim" from dropdownBox and enter "6000" in amount field
    When he will click on Transfer Button
    Then he should get Balance "5000.00" and message "Transfer failed!! account cannot be overdrawn"

  Scenario: Valid Payee and valid amount
    Given user is on Funds Transfer Webpage
    When he will select "Jim" from dropdownBox and enter "1000" in amount field
    When he will click on Transfer Button
    Then he should get Balance "4000.00" and message "$1000 transferred successfully to Jim!!"

  Scenario: Invalid Payee and valid amount
    Given user is on Funds Transfer Webpage
    When he will select "John" from dropdownBox and enter "2000" in amount field
    When he will click on Transfer Button
    Then he should get Balance "5000.00" and message "Transfer failed!! 'John' is not approved. Please contact your branch"

  Scenario: Invalid Payee and invalid amount
    Given user is on Funds Transfer Webpage
    When he will select "John" from dropdownBox and enter "6000" in amount field
    When he will click on Transfer Button
    Then he should get Balance "5000.00" and message "Transfer failed!! 'John' is not approved. Please contact your branch"
