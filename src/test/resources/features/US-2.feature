# language: de
# encoding: utf-8
Funktionalität: Als Benutzer der Kaffeemaschine möchte ich, dass kein Kaffee aus der Maschine kommt, wenn kein Becher untergestellt ist, damit ich die Schweinerei hinterher nicht aufwischen muss.


  @SKIL-1 @OPEN
  Szenario: Wenn kein Becher untergestellt ist, darf kein Kaffee aus der Maschine kommen
    Angenommen ich betrachte die Kaffeemaschine
    Und die Kaffeemaschine ist eingeschaltet
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben
    Und im Display wird angezeigt, dass der Benutzer eine Tasse unterstellen muss


  @SKIL-1 @OPEN
  Szenario: Wenn die Maschine nicht eingeschaltet ist, kommt auch kein Kaffee raus
    Angenommen ich betrachte die Kaffeemaschine
    Und die Kaffemaschine ist ausgeschaltet
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben

  @SKIL-1 @OPEN
  Szenario: Die Nachricht, dass eine Tasse untergestellt werden soll, muss verschwinden, wenn 10 sek. nichts betätigt wird
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und es ist kein Becher untergestellt
    Und ich drücke den Knopf für Kaffee
    Und im Display wird angezeigt, dass der Benutzer eine Tasse unterstellen muss
    Dann wird nach 11 Sekunden die Nachricht ausgeblendet