Feature: User
  As a admin
  I want to see list of user
  So that I can create new user

  Scenario: POST - As admin I have be able to create new user
    Given I set POST api endpoint
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user

  Scenario: POST - As admin I have be able to register
    Given I set POST api endpoint to register
    When I send POST HTTP request to register
    Then I receive valid HTTP response code 200
    And I receive valid data for register

  Scenario: PUT - As admin I have to be able to update an user
    Given I set PUT api endpoint
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for updated user

