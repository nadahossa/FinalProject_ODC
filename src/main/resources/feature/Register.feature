@smoke
  Feature: register
      Scenario: Register with valid data

        Given go to sign up page
        When enter valid data
        And click on Register button
        Then verify the user sign up successfully

    Scenario: sign up with invalid email
        Given go to sign up page
        When enter invalid data
        And click on Register button
        Then verify the user dont sign up