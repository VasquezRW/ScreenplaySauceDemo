Feature: Iniciar sesión en la aplicacion de saucedemo

  @login
  Scenario: Ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"
