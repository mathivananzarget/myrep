/*document.addEventListener("mousemove",function(event){
	console.log("X : "+event.clientX+" Y : "+event.clientY);
});*/
document.addEventListener("click",function(e)
{
var x=e.target.tagName;

console.log("X : "+event.clientX+" Y : "+event.clientY+" "+x);
/*
if(x=="BODY")
console.log("X : "+event.clientX+" Y : "+event.clientY+" "+x);
else
console.log(x);  */
if(x=="A")
{
	console.log(event.target.getAttribute('href'));
}
})

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