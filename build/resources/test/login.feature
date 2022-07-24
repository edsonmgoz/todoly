Feature: Login

  Scenario: verify the login is successfully

    Given la pagina "http://todo.ly/" este abierta
    When yo quiero realizar el login
      | email    | edsonmgoz1@gmail.com |
      | password | helloween            |
    Then yo deberia ingresar a la app web
