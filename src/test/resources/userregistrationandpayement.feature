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
    Then user navigate to item page
    When user select item
    And goto item cart
    Then enter shipping details
    And click on payment
    Then verify payment successful

    @loginuser
    Given click on singin link
    And login with valid credential
    When user navigate to item page
    And user select item
    When goto item cart
    Then enter shipping details
    And click on payment
    Then verify payment successful

