


Feature: ingresar al simulador de credito de libre inversion en bancolombia
  Como persona natural necesito ingresar al simulador de un credito de libre inversion
  en bancolombia para conocer las tasas y tarifas que tendria en caso de solicitar un
  credito


  Scenario: ingresar al modulo de simulacion de credito de libre inversion
    Given que me encuentro en la pagina personas de bancolombia
    When encuentre el modulo de simulador
    Then verifico que estoy en el simulador
    When ingrese satisfactoriamente los campos del formulario
    Then puedo ver las tasas y tarifas del credito
