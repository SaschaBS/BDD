# language: de
# encoding: utf-8
Funktionalität:  Wenn die Menge der gebrühten Kaffees der eingestellten Menge im Serviceintervall entspricht, darf kein weiterer Kaffee mehr ausgegeben werden.

  Szenario: Nach einem bestimmten Intervall darf kein Kaffee mehr ausgegeben werden, da die Maschine zuerst gereinigt werden muss
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und das Serviceintervall wurde erreicht
    Und ich nehme den Becher aus der Maschine
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Dann wird kein Kaffee ausgegeben
    Und die Servicenachricht wird angezeigt



