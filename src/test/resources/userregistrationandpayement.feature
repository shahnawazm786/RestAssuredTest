@uifeatures
Feature: Add new user and make a payment
  A new user visit the site
  Registered
  Select item
  Make payment
  @registereduser
  Scenario: Add new user and make transaction for item
    Given enter mandatory data for registration
    When click on register
    Then verify user registered
    When user login with valid credential
    Then user navigate to item page
    When user select item
    And click on payment
    Then verify payment successful

