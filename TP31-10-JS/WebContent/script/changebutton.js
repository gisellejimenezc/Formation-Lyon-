function modifyText(){
	var elem = document.getElementById("mytext");
	console.log(elem);
	elem.innerHTML = "Et ça change !";
}

function createFriday(){
	var div1= document.getElementById("mer");
	console.log(div1);
	var elem = document.createElement("h1");
	elem.innerHTML = "C'est comme un vendredi !";
	div1.appendChild(elem);
}

function addTableRow(){
	var tabbody= document.getElementById("tableBody");
	for(var i=1; i<11; i++){
		var line = document.createElement("tr");
		var row1 =document.createElement("td");
		row1.innerHTML=i;
		line.appendChild(row1);
		var row2 = document.createElement("td");
		row2.innerHTML ="value " + i;
		line.appendChild(row2);
		console.log(line);
		tabbody.appendChild(line);
	}
}

function createText(){
	var monText = document.getElementById("monText");
	var text = document.getElementById("petitText").value;
	console.log(petitText);
	var petitText = document.createElement("p");
	petitText.innerHTML = text;
	monText.appendChild(petitText);
}

function createRow(){
		var tabbody1= document.getElementById("tableBody1");
		var line = document.createElement("tr");
		var cell1 =document.createElement("td");
		cell1.innerHTML= document.getElementById("cell1").value;
		var cell2 = document.createElement("td");
		cell2.innerHTML = document.getElementById("cell2").value;
		if(document.getElementById("cell1").value== "" ||document.getElementById("cell2").value ==0){
			alert("Entrez qq chose !");
		}else{
		line.appendChild(cell1);
		line.appendChild(cell2);
		tabbody1.appendChild(line);
		}
}

function deleteRow(toto){
	
	toto.parentNode.parentNode.remove();
}
