/** 
XmlHttp对象
用法: XmlHttp.call("get","1.jsp",null,callback);
callback的写法
必须有一个 参数,用于接收xmlhttp对象: 
function callback(xmlhttp){  
	alert(xmlhttp.responseText);  
}
例子:
   XmlHttp.call("POST","http://127.0.0.1:8080/test/4.jsp",null,fun);
 function fun(xmlhttp){
	alert(xmlhttp.responseText);
}
*/


var XmlHttp=new function(){
	this.init=function(){
		var xmlhttp=false;
		try{
			xmlhttp=new XMLHttpRequest();
		}catch(trymicrosoft){
			try {
			xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");		
			} catch (othermicrosoft) {
				try {
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");		
				} catch (failed) {
				xmlhttp = false;
				}
			}
		}
		if(!xmlhttp){
			alert("创建request错误,请稍候重试");
			return;
		}
		return xmlhttp;
	}
	
	this.call=function(method,url,content,callback){
		var xmlhttp=this.init();
			xmlhttp.open(method,url);
			if(content!=null && content!=""){
				xmlhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"); 
				xmlhttp.send(content);
			}else{
				xmlhttp.send(null);
			}
			xmlhttp.onreadystatechange=function(){
				if(xmlhttp.readyState==4&&xmlhttp.status==200){
					//alert(xmlhttp.responseText+xmlhttp);
					callback(xmlhttp);
				}
			}
	}
	this.test=function(a){
		return 'ab:'+a;
	}
}
/**
*  js request对象
* 作用:获取url传来的参数,
* 用法:xx.jsp?aciton=abc; 则Request.action的值为abc
* version 1,根据key获取value,Request.value("name");
* version 2,Request.length;  //请求参数的个数
* version 3,Request.names;  //获取keys数组
* version 4,Request.values; //获取values数组
*/
  var xmlRequest=new function(){
   var names=[]; //参数名列表
   var values=[]; //参数值列表
	var queryString=location.search.substr(1);
	var params=queryString.split("&");
	  for(var i=0;i<params.length;i++){
		var param=params[i].split("=");
			names[names.length]=param[0];
			values[values.length]=param[1];
	  }
	this.names=names;
	this.values=values;
	this.length=params.length;
	/*function getParameter
	  null :无此属性
	*/
	this.value=function(name){
		for(i=0;i<names.length;i++){
			if(names[i]==name){
				return values[i];
			}
		}
		return null;
	}
  }