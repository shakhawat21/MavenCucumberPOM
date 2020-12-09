Feature: BNS Registrtion form
  As a user he wants to create new account  by using BNS Registrtion form

  Scenario: Create a new account on BNS page
    Given user is on BNS signup  webpage
    When user will enter data from fllowing table
      | FirstName | LastName | Email           | Password | Phone        |
      | Ataur     | Rahman   | ataur@gmail.com | 1234shdj | 247 378 3746 |
    And user will select from following table
      | Month | Jun  |
      | Day   |   20 |
      | Year  | 1998 |
    And user will click on following table
      | Gender |
      | Male   |
     
    And user will click on SSN check box
    Then user should create new account successfully
