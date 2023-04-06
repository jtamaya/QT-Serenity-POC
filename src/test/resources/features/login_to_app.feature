Feature: Login to app

  Scenario: User logs into app
    Given user is on Login Page
    When user enters username and password
    Then user should see platform list

