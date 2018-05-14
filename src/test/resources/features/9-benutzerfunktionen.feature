# language: de
Funktionalität: Benutzerfunktionen


  @SOL-1 @OPEN
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


  @SOL-2 @OPEN
  Szenario: Wenn kein Becher untergestellt ist, darf kein Kaffee aus der Maschine kommen
    Angenommen Ich betrachte die Kaffeemaschine
    Und Die Kaffeemaschine ist eingeschaltet
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben
    Und im Display wird angezeigt, dass der Benutzer eine Tasse unterstellen muss


  @SOL-2 @OPEN
  Szenario: Wenn die Maschine nicht eingeschaltet ist, kommt auch kein Kaffee raus
    Angenommen Ich betrachte die Kaffeemaschine
    Und die Kaffemaschine wurde noch nicht eingeschaltet
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben


  @SOL-2 @OPEN
  Szenario: Die Nachricht, dass eine Tasse untergestellt werden soll, muss verschwinden, wenn 10 sek. nichts betätigt wird
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und es ist kein Becher untergestellt
    Und ich drücke den Knopf für Kaffee
    Und im Display wird angezeigt, dass der Benutzer eine Tasse unterstellen muss
    Dann wird nach 11 Sekunden die Nachricht ausgeblendet


  @SOL-3 @OPEN
  Szenario: Der Becher muss zunächst entnommen werden, bevor ein neuer Kaffee angefordert werden kann
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Und es ist Kaffee im Becher
    Und ich drücke den Knopf für Kaffee
    Dann wird kein weiterer Kaffee ausgegeben
    Und es wird die Nachricht ausgegeben, dass der Kaffee zuerst entnommen werden muss


  @SOL-3 @OPEN
  Szenario: Wenn der Becher entnommen wird kann wieder ein Kaffee angefordert werden
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Und es ist Kaffee im Becher
    Und ich nehme den Becher aus der Maschine
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Dann wird ein Kaffee ausgegeben


  @SOL-5 @OPEN
  Szenario: Nach erfolgter Reinigung, muss dem Benutzer wieder ein Kaffee serviert werden
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und das Serviceintervall wurde erreicht
    Und ich drücke den Knopf für die automatische Reinigung
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Dann wird ein Kaffee ausgegeben


  @SOL-4 @OPEN
  Szenario: Nach einem bestimmten Intervall darf kein Kaffee mehr ausgegeben werden, da die Maschine zuerst gereinigt werden muss
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und das Serviceintervall wurde erreicht
    Und ich nehme den Becher aus der Maschine
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben
    Und die Servicenachricht wird angezeigt


  @SOL-1 @OPEN
  Szenariogrundriss: Wenn die Maschine noch nicht eingeschaltet wurde, leuchtet die Powertaste rot und ein Hinweistext, weist darauf hin, dass sie eingeschaltet werden muss
    Angenommen Ich betrachte die Kaffeemaschine
    Und die Kaffemaschine wurde noch nicht eingeschaltet
    Und die eingestellte Sprache ist "<sprache>"
    Dann zeigt das Display zeigt die Nachricht "<nachricht>" an

    Beispiele:
      | sprache | nachricht                           |
      | de      | Bitte den Einschaltknopf drücken!   |
      | en      | Push Power to start coffee machine! |
