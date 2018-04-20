# language: de
# encoding: utf-8
Funktionalität: Als Benutzer der Kaffeemaschine möchte ich, dass kein Kaffee aus der Maschine kommt, wenn kein Becher untergestellt ist, damit ich die Schweinerei hinterher nicht aufwischen muss.

  @SKIL-1 @OPEN
  Szenario: Die Nachricht, dass eine Tasse untergestellt werden soll, muss verschwinden, wenn 10 sek. nichts betätigt wird
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und das Serviceintervall wurde erreicht
    Und die Servicenachricht wird angezeigt
    Dann wird nach 10 Sekunden die Servicenachricht ausgeblendet