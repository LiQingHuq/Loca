/**
 * 
 */

String.prototype.toCharArray=function(){
	
	var char=[];
	for(var v=0;v<this.Length;v++){
		char[v]=this.charAt(x);
	}
	return char;
}

String.prototype.resive=function(){
   var arr=this.toCharArray();
   function swap(arr,a,b){
		var temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
	}
   for(var x=0,y=arr.length-1;x<y;y--,x++){
	   swap(arr,x,y);
   }     
   return arr.jion("");
}


