@API_Feature
Feature: Demo API test
  Description : This is designed for the test app url
  https://reqres.in/api
  @listuser
  Scenario: List the User using API
    Given set the base url for the api
  When set the endpoints for the list user
  Then list the user data
  And response should be 200

  @adduser
  Scenario: Add user
    Given set the base url for the api
    When enter data to add user
    And response should be 201

