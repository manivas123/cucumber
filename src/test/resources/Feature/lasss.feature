Feature: verifying facebook login module

  Scenario Outline: verifying facebook iogin with valid creations
    Given user is on facebook page
    When user enter "<userName>" and "<password>"
    And user click the lolgin button
    Then user should verify after login success message

    Examples: 
      | userName  | password      |
      | gokul6757@gmail.com | Gokul@123 |
      | greensjdk | mani@u749494  |
      | mani      | mani@w8494984 |
