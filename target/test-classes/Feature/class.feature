Feature: verifying facebook login module

  Scenario: verifying facebook login with valid crdentials
    Given user is on the facebook page
    When user enter username and password
    And user click the login button
    Then user should verrify after login success message
