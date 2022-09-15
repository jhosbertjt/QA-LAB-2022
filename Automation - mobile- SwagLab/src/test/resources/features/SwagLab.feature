Feature: SwagLab

  @login
  Scenario: Login exitoso a la homepage de SwagLab

    Given que me encuentro en la aplicación SwagLab
    When ingreso el usuario "standard_user"
    And ingreso la contraseña "secret_sauce"
    And hago clic en Login
    Then valido que aparezca el titulo "Products"
    And que aparezca el producto "Sauce Labs Backpack"