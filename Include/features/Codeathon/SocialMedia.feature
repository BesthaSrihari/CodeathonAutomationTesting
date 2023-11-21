Feature: Test the over all scenario of Application

  Scenario: TC_001_Verify that user able to access site
    Given Open Browser
    Then Enter valid Credentials
    Then Verify User is able to login or not

  Scenario: TC_002_Verify that if user login with invaild credentials
    Given Open Browser
    Then Enter Invalid Credentials
    Then Verify User is able to login or not

  Scenario: TC_003_Verify with Blank Username and Password in Login page
    Given Open Browser
    Then Enter Blank Credentials
    Then Verify User is able to login or not

  Scenario: TC_004_Verify Signup page
    Given Open Browser
    Then Click and Verify SignUp page
    Then Fill Mandatory Fields of SignUp Page

  Scenario: TC_005_Verify the vaildation of Email id field
    Given Open Browser
    Then Click and Verify SignUp page
    Then Fill Mandatory Fields of SignUp Page

  Scenario: TC_006_Verify the vaildation of Password
    Given Open Browser
    Then Click and Verify SignUp page
    Then Fill Mandatory Fields of SignUp Page

  Scenario: TC_007_Verify the vaildation of Password and Confirm Password
    Given Open Browser
    Then Click and Verify SignUp page
    Then Verify the vaildation of Password and Confirm Password
    Then Verify the Error Message

  Scenario: TC_08_Verify the Search box in dashboard page
    Given Open Browser
    Then Enter Invalid Credentials
    Then Verify User is able to login or not
    Then Verify the Search box in dashboard page

  Scenario: TC_09_Verify the functionalities in dashboard page
    Given Open Browser
    Then Enter Invalid Credentials
    Then Verify User is able to login or not
    Then Verify the Search box in dashboard page
    Then Verify functionalities of dashboard
  