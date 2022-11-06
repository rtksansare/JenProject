Feature: To test login functionality

  @SmokeScenario
  Scenario: Test Login with correct credentials
    Given user is on login page
    When user enters correct username and password
    And clicks on login button
    Then user navigated to homepage

  @ParameterizedScenario
  Scenario Outline: Test Login with correct credentials
    Given user is on login page
    When user enters correct "<username>" and "<password>"
    And clicks on login button
    Then user navigated to homepage

    Examples:
    |username|password|
    |rutik   |sansare |
    |king    |kohli   |
    |ms      |dhoni   |




