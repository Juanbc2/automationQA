

Feature: Simular un credito de libre inversion en Bancolombia
  Como persona natural necesito simular un credito de libre inversion en Bancolombia
  Para conocer las tasas y tarifas que tendria en caso de solicitar un credito


  Scenario: Buscar el apartado de creditos en la seccion personas de Bancolombia
    Given que me encuentro en la pagina personas de Bancolombia
    When explore la pagina personas
    Then puedo ver el boton saber mas para Creditos