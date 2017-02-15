/*document.addEventListener("mousemove",function(event){
	console.log("X : "+event.clientX+" Y : "+event.clientY);
});*/

/*
if(x=="BODY")
console.log("X : "+event.clientX+" Y : "+event.clientY+" "+x);
else
console.log(x);  */


var len=document.getElementsByTagName('a');
for(var i=0;i<len;i++)
{
len[i].addEventListener("mouseover",function(e){

var ii=e.target.getAttribute('href');
	console.log(ii);})
}

function myfun()
{
	var y=this.href;
var x=this.getAttribute('href');
console.log(y);	
}




document.addEventListener("click",function(e)
{

var x=e.cilentX;
var y=e.clientY;
var elmnt=document.body;
var xx=document.body.offsetHeight;
var yy=document.body.offsetWidth;
console.log("X : "+e.clientX+"  Y : "+y);
console.log("ScreenX : + "+e.screenX+" Screeny "+e.screenY);
console.log("hello"+window.screen.height);
console.log("window.width"+window.innerWidth+" window.height  "+window.innerHeight);
console.log("screen.width "+screen.width+"screen.height "+screen.height);
console.log("document w"+xx+"  height"+yy);

}
);





document.addEventListener("scroll",function(e)

{
	/*
var elmnt=document.body;
var sw=screen.width;
var sh=screen.height;
var ww=window.innerWidth;
var wh=window.innerHeight;
//var cxp=e.clientX;
//var cyp=e.clientY;
var vw=elmnt.scrollTop;
var vh=elmnt.scrollLeft;
console.log("Screen width "+sw+" Screen height "+sh);
console.log("Window width "+ww+" Window height "+wh);
//console.log("cursor x pos "+cxp+" Cursor y pos "+cyp);
console.log("visible "+vw);  */
Time();
i=0;



}
	);

var i = 0;
function myFunction() {
    i++;
  //document.getElementById("para").innerHTML = i;
    setTimeout(myFunction, 1000);
}
myFunction();

function Time()
{

	console.log("Last  visit seconds "+i );
}



















/*



document.addEventListener("click",function(e)
{
var x=e.target.tagName;

console.log("X : "+event.clientX+" Y : "+event.clientY+" "+x);
if(x=="A")
{
	console.log(event.target.getAttribute('href'));
}
})



*/



