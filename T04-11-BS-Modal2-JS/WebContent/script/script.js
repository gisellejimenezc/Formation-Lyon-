function deleteRow(thisLine){
	thisLine.parentNode.parentNode.remove();
}

function createRow(){
	var tabbody= document.getElementById("tableBody");
	var line = document.createElement("tr");
	var cell1 =document.createElement("th");
	cell1.innerHTML= document.getElementById("cell1").value;
	var cell2 = document.createElement("td");
	cell2.innerHTML = document.getElementById("cell2").value;
	var cell3 = document.createElement("td");
	cell3.innerHTML = document.getElementById("cell3").value;
	var cell4 = document.createElement("td");
	cell4.innerHTML = document.getElementById("cell4").value;
	var cell5 = document.createElement("td");
	cell5.innerHTML = document.getElementById("cell5").value;
	var cell6 = document.createElement("td");
	cell6.innerHTML = "<button onclick=\"assignId(this)\" type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"fas fa-edit\"></i></button><button class=\"btn\" onclick=\"deleteRow(this)\"><i class=\"fa fa-trash\"></i></button>";
	if(document.getElementById("cell1").value== "" ||document.getElementById("cell2").value ==0){
		alert("Entrez qq chose !");
	}else{
	line.appendChild(cell1);
	line.appendChild(cell2);
	line.appendChild(cell3);
	line.appendChild(cell4);
	line.appendChild(cell5);
	line.appendChild(cell6);
	tabbody.appendChild(line);
	}
}

function modifierRow(){
	var id =  document.getElementById("cellm1").value;
	var thisbutton= document.getElementById(id);
	var tablebody = document.getElementById("tableBody");
	console.log("button:",thisbutton);
	for (var row of tablebody.children){
		
		if(row.nodeName != "#text" && id == row.childNodes[1].innerHTML){
			var thisrow = thisbutton.parentNode.parentNode;
			console.log("thisrow:",thisrow);
			console.log("l:",thisrow.childNodes.length);
			for(var i=0; i<thisrow.childNodes.length; i++){
				thisrow.childNodes[i].remove();
			}
			console.log("thisrowAfter:",thisrow);

			var cell1 =document.createElement("th");
			cell1.innerHTML= document.getElementById("cellm1").value;
			var cell2 = document.createElement("td");
			cell2.innerHTML = document.getElementById("cellm2").value;
			var cell3 = document.createElement("td");
			cell3.innerHTML = document.getElementById("cellm3").value;
			var cell4 = document.createElement("td");
			cell4.innerHTML = document.getElementById("cellm4").value;
			var cell5 = document.createElement("td");
			cell5.innerHTML = document.getElementById("cellm5").value;
			var cell6 = document.createElement("td");
			cell6.innerHTML = "<button onclick=\"assignId(this)\" type=\"button\" class=\"btn btn-info btn-lg\" data-toggle=\"modal\" data-target=\"#myModalM\"><i class=\"fas fa-edit\"></i></button><button class=\"btn\" onclick=\"deleteRow(this)\"><i class=\"fa fa-trash\"></i></button>";
			thisrow.appendChild(cell1);	
			thisrow.appendChild(cell2);
			thisrow.appendChild(cell3);
			thisrow.appendChild(cell4);
			thisrow.appendChild(cell5);
			thisrow.appendChild(cell6);
		}
	}
}

function assignId(elem){
	var line= elem.parentNode.parentNode;
	var id=line.childNodes[1].innerHTML;
	console.log(line);
	console.log(id);
	elem.setAttribute("id",id);
	console.log("elem:",elem);
	console.log(elem.getAttribute("id"));
}

