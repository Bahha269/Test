let stpbl1=document.grtElementById("stepbl1");
let stpbrdr1=document.grtElementById("stepbrdr1");

let stpbl2=document.grtElementById("stepbl2");
let stpbrdr2=document.grtElementById("stepbrdr2");

stpbl1.onmouseover = function(){
	stepbrdr1.style.borderBottom = "3px solid white";
}
stpbl1.onmouseout = function(){
	stepbrdr1.style.borderBottom = "3px solid black";
}

stpbl2.onmouseover = function(){
	stepbrdr2.style.borderBottom = "3px solid white";
}
stpbl2.onmouseout = function(){
	stepbrdr2.style.borderBottom = "3px solid black";
}