<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo Use Ajax  </title>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js">
</script>

</head>
<body>
    <center>
        <h1>Struts2 Demo Ajax</h1>
        <div>
            <h2>注册</h2>
            <%-- 注册表单 --%>
            <div>
                <label for="name">姓名
                    <input type="text" name="name"/>
                </label>
                <br>
                <label for="age">年龄
                    <input type="text" name="age"/>
                </label>
                <br>
                <label for="position">职位
                    <input type="text" name="position"/>
                </label>
                <br>
                <button onclick="submit()" >提交</button>
            </div>
        </div>

        <div>
            <h2>提交结果</h2>
            <p>姓名<span id="name">暂无数据</span></p>
            <p>年龄<span id="age">暂无数据</span></p>
            <p>职位<span id="position">暂无数据</span></p>

        </div>
    </center>
    <script>
        function submit(){
            var name = $("input[name=name]").val();
            var age = $("input[name=age]").val();
            var position = $("input[name=position]").val();
            $.ajax(
                {
                    type:"post",
                    url:"RegisterAction",
                    data:{
                        name:name,
                        age:age,
                        position:position
                    },
                    dataType:"json",
                    success:function(data){
                        var name = $("#name");
                        var age = $("#age");
                        var position = $("#position");
                        name.text(data);
                        age.text(data);
                        position.text(data);
                    },
                    error:function(){
                        update();
                        alert("系统异常，请稍后再试");
                    }
                }
            )
        };

        function update(data){
            console.log(data);

        }
    </script>
</body>

</html>