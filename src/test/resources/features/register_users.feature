Feature: I as End User
  I can enter the new user registration form on the Utest website

  @EscenarioPrincipal
  Scenario: successful user creation
    Given the user enters the main page and clicks the Join today button
    When The user enters all the required data in the fields of the form
    Then The user sees theirs username


