

Feature: Ingresar al simulador de credito de libre inversion en Bancolombia
  Como persona natural necesito ingesar al simulador de un credito de libre inversion
  en Bancolombia para conocer las tasas y tarifas que tendria en caso de solicitar un
  credito


  Scenario: Ingresar al modulo de simulacion de credito de libre inversion
    Given que me encuentro en la pagina personas de Bancolombia
    When encuentre el modulo de simulador
    Then verifico que estoy en el simulador
    When ingrese satisfactoriamente los campos del formulario
    Then puedo ver las tasas y tarifas del credito
