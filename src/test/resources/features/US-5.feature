# language: de
# encoding: utf-8
Funktionalität: Wenn eine Reinigung erforderlich ist, und der Anwender reinigt die Maschine mit der automatischen Reinigungsfunktion, muss es wieder möglich sein, einen Kaffee anzufordern.

  Szenario: Nach erfolgter Reinigung, muss dem Benutzer wieder ein Kaffee serviert werden
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und das Serviceintervall wurde erreicht
    Und ich drücke den Knopf für die automatische Reinigung
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Dann wird ein Kaffee ausgegeben