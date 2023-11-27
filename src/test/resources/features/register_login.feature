@FLUJOSLOGIN
Feature: Realizar flujo basico y alternos para registrarse y loguearse
  Como usuario quiero poder loguearme en JPetStore


  Background:
    Given el usuario ingrese a JPetStore
    When el usuario de clic en Sign In

    @REGISTROCORRECTO
      Scenario: Verificar registro correcto en JpetStore
      And el usuario de clic en register now
      And el usuario diligencie los campos obligatorios del formulario
      And el usuario de clic en Save Account Information
      Then el usuario volvera al Inicio



  @LOGINCORRECTO
    Scenario:Verificar el logueo correcto a JPetStore
    And el usuario ingrese usuario y contrasenna
    And el usuario de clic en Login