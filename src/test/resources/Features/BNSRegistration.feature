Feature: BNS Registrtion form
  As a user he wants to create new account  by using BNS Registrtion form

  Scenario Outline: BNS Registrtion form fillup
    Given User is on BNS Registration form  webpage
    When User will enter "<FirstName>" in FirstName field, "<LastName>" in LastName field,"<Email>" in Email field, "<Password>" in Password field, "<Phone>" in Phone Field
    And User will select birthday "<Month>" from month dropdown, "<Day>" from day dorpdownn, "<Year>" from year dropdown
    And User will click on "<Gender>" radiobutton
    And User click on SSN Checkbox
    Then User should create new account successfully

    Examples: 
      | FirstName | LastName | Email            | Password | Phone        | Month | Day | Year | Gender |
      | Ataur     | Tarafder | super@yahoo.com  | 2367hyy3 | 345 345 3450 | Jun   |  20 | 1996 | Male   |
      | Masuda    | Hossain  | masuda@yahoo.com | 2367hyy3 | 345 345 3450 | May   |  30 | 1998 | Female |
