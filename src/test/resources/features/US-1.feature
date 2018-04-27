# language: de
Funktionalität: Einschalten der Kaffeemaschine

  Szenariogrundriss: Wenn die Maschine noch nicht eingeschaltet wurde, leuchtet die Powertaste rot und ein Hinweistext, weist darauf hin,   dass sie eingeschaltet werden muss.
    Angenommen Ich betrachte die Kaffeemaschine
    Und die Kaffemaschine wurde noch nicht eingeschaltet
    Und die eingestellte Sprache ist "<sprache>"
    Dann zeigt das Display zeigt die Nachricht "<nachricht>" an

    Beispiele:
      | sprache | nachricht                           |
      | de      | Bitte den Einschaltknopf drücken!   |
      | en      | Push Power to start coffee machine! |

  Szenariogrundriss: Wenn die Maschine eingeschaltet wurde, leuchtet die Powertaste grün und die Maschine begrüßt den Anwender
    Angenommen Ich betrachte die Kaffeemaschine
    Und die Kaffemaschine wurde noch nicht eingeschaltet
    Und ich schalte die Kaffemaschine ein
    Und die eingestellte Sprache ist "<sprache>"
    Dann leuchtet der Einschaltknopf grün
    Und zeigt das Display zeigt die Nachricht "<nachricht>" an

    Beispiele:
      | sprache | nachricht  |
      | de      | Willkommen |
      | en      | Welcome!   |
