//名称：		submitDist.js
//機能：		フォームのaction変更
//対象画面：	receiveValue.html
//対象フォーム：	sendValue


//各submitのtarget取得
const select = document.getElementById("select");
const update = document.getElementById("update");
const deleteConst = document.getElementById("delete");
const insert = document.getElementById("insert");
const getProperty = document.getElementById("getProperty");

//select押下時
select.addEventListener("click", function(){	
	document.sendValue.action = "select";
});

//update押下時
update.addEventListener("click", function(){	
	document.sendValue.action = "update";
});

//delete押下時
deleteConst.addEventListener("click", function(){	
	document.sendValue.action = "delete";
});

//insert押下時
insert.addEventListener("click", function(){	
	document.sendValue.action = "insert";
});

//getProperty押下時
getProperty.addEventListener("click", function(){	
	document.sendValue.action = "getProperty";
});

//function test(event){
//	alert("select")	
//}
//alert("js")
//function select(event){
//	alert("select")	
//	document.sendValue.action = "select";
//}

//const select = document.getElementById("select");
//select.addEventListner(event){
//	console.log(select);
//}
