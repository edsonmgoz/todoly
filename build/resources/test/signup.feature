Feature: Signup

  Scenario: signup new user

    Given Acceder a "http://todo.ly/"
    When yo quiero crear una nueva cuenta
      | fullname | Edson3               |
      | email    | edsonmgoz[random]@gmail.com |
      | password | helloween            |
    Then yo deberia acceder a la web
