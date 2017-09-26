# language: de
Funktionalität: Der Anwender bekommt einen Titel angezeigt

  Szenario: Beim Aufruf der Seite wird ein passender Titel angezeigt
    Angenommen ich bin auf der Begruessungsseite
    Dann wird als Titel "Getting Started: Handling Form Submission" angezeigt

  Szenario:Nach Eingabe eines Grusses wird die Ergebnisseite angezeigt
    Angenommen ich bin auf der Begruessungsseite
    Und trage im Feld "id" "1" ein
    Und trage im Feld "content" "Hallo" ein
    Und druecke Abschicken
    Dann wird die Ergebnisseite angezeigt