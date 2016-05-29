function loadPage(name) {
	
	var req = new XMLHttpRequest();
	
	// Verbindung öffnen
	req.open("GET",  "JavaScript-Tabelle-"+name+".html", true);
	
	// Handler für Antwort setzen
	req.onreadystatechange = function receive() {
		if (req.readyState==4) {
			answer = req.responseText;
			document.getElementById("tableData").innerHTML=answer;
		}
	};
	
	// Anfrage abschicken
	req.send();
	
}

