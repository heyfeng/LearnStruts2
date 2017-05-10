<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo Use Ajax </title>
    <script type="text/javascript">
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
    </script>
</head>
<body>
    <center>
        <h2> Struts2 Demo Use Ajax</h2>
        <div id="head">
            <%--<p>每隔两秒钟刷新一次时间</p>--%>
            <%--<sx:div id="tsdiv" cssStyle="border:2px solid blue;"--%>
                    <%--updateFreq="2000" href="ShowTimeAction">--%>
            <%--</sx:div>--%>
        </div>

        <div>
            <div id="time"></div>
            <input type="button" value="时间" onclick="createRequest()";/>
        </div>

        <div>
            <div>
                <font color="red">
                    <s:div id="showMessage">

                    </s:div>
                </font>
            </div>

            <div>
                <sx:a targets="showMessage" href="AjaxAction?name=test&phone=18612692454">
                    sx:a标签测试
                </sx:a>
            </div>
        </div>
    </center>
</body>
</html>