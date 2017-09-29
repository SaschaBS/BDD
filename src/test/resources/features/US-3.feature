# language: de
# encoding: utf-8
Funktionalität:  Es darf nicht möglich sein, einen weiteren Kaffee anzufordern, wenn noch ein gefüllter Becher in der Maschine steht, damit der Becher nicht überläuft.

  Szenario: Der Becher muss zunächst entnommen werden, bevor ein neuer Kaffee angefordert werden kann
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Und es ist Kaffee im Becher
    Und ich drücke den Knopf für Kaffee
    Dann wird kein weiterer Kaffee ausgegeben
    Und es wird die Nachricht ausgegeben, dass der Kaffee zuerst entnommen werden muss

  Szenario: Wenn der Becher entnommen wird kann wieder ein Kaffee angefordert werden
    Angenommen Die Kaffeemaschine ist eingeschaltet
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Und es ist Kaffee im Becher
    Und ich nehme den Becher aus der Maschine
    Und ich stelle einen Kaffeebecher in die Maschine
    Und ich drücke den Knopf für Kaffee
    Dann wird ein Kaffee ausgegeben