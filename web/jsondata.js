function loadPage(number) {
	
	var req = new XMLHttpRequest();
	
	// Verbindung öffnen
	req.open("GET",  "getList.jsp?page="+number, true);
	
	// Handler für Antwort setzen
	req.onreadystatechange = function receive() {
		if (req.readyState==4) {
			var answer = req.responseText;
			var data = JSON.parse(answer);
			html = "";
			for (var i=0; i<data.length; i++) {
				html += "<tr>" + 
						"<td>" + data[i].name + "</td>"+
						"<td>" + data[i].christianname + "</td>"+
						"<td>" + data[i].email + "</td>"+
						"<td>" + data[i].phone + "</td>"+
						"</tr>";
			}
			document.getElementById("tableData").innerHTML=html;
		}
	};
	
	// Anfrage abschicken
	req.send();
	
}

