Feature: Simulacion de credito
  Como persona natural quiero poder simular un credito de libre inversion para ver las tasas y tarifas

  Scenario: Rellenar el formulario de simulacion
    Given que me encuentro en el formulario de simulacion
    When ingreso los datos que me son solicitados
    Then puedo ver las tasas y tarifas satisfactoriamente

    Scenario Outline: Rellenar el formulario de simulacion
      Given que me encuentro los campos del formulario
        | monto   | meses |
        | 1000000 | 48    |
      When ingrese satisfactoriamente
      Then puedo continuar simulando

      Examples:
        | 31250000 | 60 |
        | 62500000 | 72 |
        | 125000000 | 84 |
