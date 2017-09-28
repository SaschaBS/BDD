# language: de
# encoding: utf-8

#noinspection NonAsciiCharacters
Funktionalität:
  Die Kaffeemaschine muss verhindern, dass ein Kaffee zubereitet wird, wenn kein Becher untergestellt wurde, damit kein Kaffee auf den Boden läuft.

  Szenario: Es muss ein Becher untergestellt sein, damit ein Kaffe gebrüht werden kann
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und es ist kein Becher untergestellt
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben
    Und im Display wird angezeigt, dass der Benutzer eine Tasse unterstellen muss

  Szenario: Die Nachricht, dass eine Tasse untergestellt werden soll, muss verschwinden, wenn 10 sek. nichts betätigt wird
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und das Serviceintervall wurde erreicht
    Und die Servicenachricht wird angezeigt
    Dann wird nach 10 Sekunden die Servicenachricht ausgeblendet