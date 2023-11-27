Feature: Realizar compras en JPetStore,
  Como un usuario, yo quiero poder ingresar a Jpetstore para realizar compras

  @AddtoCart
  Scenario: Agregar producto carrito de compras
    Given el usuario ingrese a JPetStore
    When el usuario selecciona una categoria
    And el usuario selecciona un producto
    And el usuario da clic en Add to Cart
    And el usuario agrega la cantidad 2
    And el usuario da clic en proceed to checkout
    Then el usuario deberia ver el login



