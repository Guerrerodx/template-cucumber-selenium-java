Feature: Login Correcto

  Scenario Outline: Success login
    Given i am on login page
    When i enter "<username>" in username
    And i enter "<password>" in password
    And i click on loginBtn
    Then I shouln't see "¿Olvidaste tu clave?"

    Examples: 
      | username  | password   |
      | TESTING01 | Tsoft.2022 |
