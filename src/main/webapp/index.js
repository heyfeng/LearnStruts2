/**
 * Created by PVer on 2017/5/10.
 */
var request;
//创建XMLHttpRequest
function createRequest() {
    var url = "time.jsp";
    if (window.XMLHttpRequest){
        request = new XMLHttpRequest();
    }else{
        alert("浏览器太旧了，换个浏览器吧");
    }

    if (request){
        //与服务端建立连接
        request.open("GET",url,true);
        request.send(null);
        request.onreadystatechange = callback;
    }
}

function callback() {
    if (request.readyState == 4){
        if (request.status == 200 ){
            display();
        }else{
            alert("服务端返回状态 " + request.statusText);
        }
    }else{
        document.getElementById("time").innerHTML = "数据加载中...";
    }
}

function display() {
   document.getElementById("time").innerHTML = request.responseText;
}
