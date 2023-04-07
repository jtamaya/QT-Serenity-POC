Feature: Test Button Click
  Scenario: A user wants to click button on DemoQA
    Given A navigates to the buttons page
    When user click on the double click button
    And user click on the single click button
    Then user should see "You have done a double click" and "You have done a dynamic click"