@BMICalculator
Feature: BMI Calculator functionalities
  As a user he wants to measure his BMI

@NoHeightNoWeight
  Scenario: No Height and No weight
    Given user is on BMI Calculator Webpages
    When he will enter "" in height_field and "" in weight _field
    When he Click on Calculate Button
    Then he should get BMI "" and Catagory ""
    Then he should get message "Please enter Height"

@HeightButNoWeight
  Scenario: Enter Height but No weight
    Given user is on BMI Calculator Webpages
    When he will enter "170" in height_field and "" in weight _field
    When he Click on Calculate Button
    Then he should get BMI "" and Catagory ""
    Then he should get message "Please enter Weight"

  Scenario: Category Underweight
    Given user is on BMI Calculator Webpages
    When he will enter "170" in height_field and "50" in weight _field
    When he Click on Calculate Button
    Then he should get BMI "17.3" and Catagory "Underweight"

  Scenario: Category Normal
    Given user is on BMI Calculator Webpages
    When he will enter "170" in height_field and "60" in weight _field
    When he Click on Calculate Button
    Then he should get BMI "20.8" and Catagory "Normal"

  Scenario: Category Overweight
    Given user is on BMI Calculator Webpages
    When he will enter "170" in height_field and "80" in weight _field
    When he Click on Calculate Button
    Then he should get BMI "27.7" and Catagory "Overweight"

  Scenario: Category Obesity
    Given user is on BMI Calculator Webpages
    When he will enter "170" in height_field and "90" in weight _field
    When he Click on Calculate Button
    Then he should get BMI "31.1" and Catagory "Obesity"
