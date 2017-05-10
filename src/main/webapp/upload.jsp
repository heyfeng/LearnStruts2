<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo File Upload</title>
</head>
<body>
    <center>
        <h3>Struts2 Demo File Upload </h3>
        <div>
            <h4>使用form表单上传</h4>
            ${error}
            <form action="UploadAction" enctype="multipart/form-data" method="post">
               <input name="upload" type="file">
                <input type="submit" value="上传">
            </form>
        </div>
        <div>
        <hr>
        <h4>使用s:form上传</h4>
        </div>
            <s:form action="UploadAction" enctype="multipart/form-data" method="post" >
                <s:file name="upload" />
                <s:submit value="上传"/>
            </s:form>
        </div>
   </center>
</body>
</html>