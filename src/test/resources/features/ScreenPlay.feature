Feature: Iniciar sesión en la aplicacion de saucedemo

  @login
  Scenario: Ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales "standard_user" "secret_sauce" y presione ingresar
    Then validamos que estemos en la pagina principal "PRODUCTS"
