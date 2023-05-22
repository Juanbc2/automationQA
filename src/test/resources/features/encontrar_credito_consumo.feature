

Feature: Ingresar al simulador de credito de libre inversion en Bancolombia
  Como persona natural necesito ingesar al simulador de un credito de libre inversion en Bancolombia
  Para conocer las tasas y tarifas que tendria en caso de solicitar un credito


  Scenario: Ingresar al modulo de simulacion de credito de libre inversion
    Given que me encuentro en la pagina personas de Bancolombia
    When encuentre el modulo de simulador
    Then verifico que estoy en el simulador


  #Scenario: Simular un credito de libre inversion dependiendo de los parametros puestos
  #Given puedo ver el boton simular credito de libre inversion e ingresar
  #When rellene los campos solicitados
  #Then me muestre las diferentes opciones de tasas y tarifas del credito