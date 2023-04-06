Feature: Get to java doc page
  Scenario: A user want to navigate to the java doc page
    Given A user is logged into the site
    When user selects the automate nav button
    And user selects "Java" as the platform
    Then user should see "Selenium with Java"