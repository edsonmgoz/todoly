Feature: ChangePassword

  Scenario: Change password and verify the login is successfully with new password

    Given la pagina "http://todo.ly/" este abierta
    And yo quiero realizar el login
      | email    | edsonmgoz1@gmail.com |
      | password | helloween            |
    When yo cambio mi password
      | oldpass | helloween |
      | newpass | gammaray  |
    And yo cierro la sesion
    Then yo deberia ingresar con mis nuevas credenciales a la app web
      | email    | edsonmgoz1@gmail.com |
      | password | gammaray             |
