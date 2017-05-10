# File Upload And Download
## How To Upload File (文件上传原理)
### 前端上传
网络传输以数据流为基础，在处理form表单的时候，可以设置form表单的enctype属性，
设置不同的属性，浏览器会以不同的方式处理表单数据，服务端根据其属性进行响应的处理。
属性有3个常用的值。
- application/x-www-form-urlencoded
    默认属性，只处理表单里的value属性，将value进行URL编码，然后上传到服务器。
- multipart/form-data
    二进制流的方式处理表单数据，文件上传下载时使用。
- text/plain
    空格转换为 "+" 加号，但不对特殊字符编码
### 后端保存
前端通过将form表单属性设为multipart/form-data后，文件内容以二进制流的方式上传
到服务器，服务从中取出二进制流，然后保存到本地文件系统中，完成文件上传功能。

在java中，web容器会将二进制流转为InputStream存入Servlet中，通过读取Servlet中
的InputStream即可获得文件上传的内容，通过I/O流，即可将文件保存到文件系统中。
## Struts2 File Upload
Struts2中没有处理multipart/form-data请求的解析器，需要调用其他请求解析器，将
HTTP请求中的表单数据解析出来，通过配置拦截器，即可使用其他请求解析器。
可以在struts.xml中设置一个常量，配置解析器的类型,常用的解析器类型有
Common-FileUpload(jakarta)组件和COS框架。需要导入相关的依赖包。
```xml
<constant name="struts.multipart.parser" value="jakarta"> </constant>
```
## A Simple File Upload Example
使用Common-FileUpload实现一个简单文件上传功能。
### 引入依赖
```xml
<!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
    <!-- 文件上传依赖 -->
    <dependency>
        <groupId>commons-fileupload</groupId>
        <artifactId>commons-fileupload</artifactId>
        <version>1.3.2</version>
    </dependency>
```
### 实现文件上传页面
- upload.jsp
```html
<h4>使用s:form上传</h4>
<s:form action="UploadAction" enctype="multipart/form-data" method="post" >
    <s:file name="upload" />
    <s:submit value="上传"/>
</s:form>
```
- Action
```java
/**
* 上传的文件
*/
private File upload;
/**
* 文件类型
*/
private String uploadContentType;
/**
* 文件名字
*/
private String uploadFileName;

//...getter and settter
public String upload(){
  //save file
  return SUCCESS;
}
```
## 上传流程
前端将文件上传到Web服务器后，先由Common-FileUpload组件解析二进制流，该组件会将得到文件保存在一个临时文件中，在由Struts2的拦截器进行处理，从临时文件中读取文件信息，而不是直接读取用户上传过来的文件。通过获取upload的文件名可以验证。
```java
System.out.println(upload.getName())
//输出 upload_a833b621_20f9_4c38_bb3b_b88d40c538f7_00000000.tmp
```
如果保存文件的时候需要用到原始文件的名字和类型，该怎样获取？
在jsp页面中，使用struts2的表单标签进行文件上传，使用s:file，该标签不仅关联了上传的文件，还关联了文件名以及文件类型，在Action中，定义一个FileName字段和ContentType字段，格式为FILEDNAME+FileName,FILEDNAME+ContentType,FILEDNAME为文件字段。
```java
在jsp中
<s:file name="NAME"/>
在Action中
//文件
File NAME;
//文件类型
String NAMEContentTYpe
//文件名
String NAMEFileName
```
##  使用上传拦截器
可以使用上传拦截器对上传的内容进行拦截，比如文件类型，文件大小。
- 拦截器配置
```
<interceptor-ref name="fileUpload">
  <!-- 配置允许上传的文件类型 -->
  <param name="allowedTypes">image/bmp,image/gif,image/jpg</param>

  <!--配置允许上传文件的扩展名,如果有多个用","隔开 -->
  <param name="allowedExtensions">txt,excel,ppt</param>

  <!-- 配置允许上传的文件大小,最大为20k -->
  <param name="maximumSize">20480</param>
</interceptor-ref>
```
## 多文件上传
多文件上传和单文件上传一样。在前端,添加多个文件输入域，在服务端，进行相应的配置，多个文件输入域可以用同一个名字，在Action中，使用List<File>。
## 文件下载
使用Struts进行文件下载，需要为Action的返回值stream类型配置结果映射。参数配置如下
- contentType
  指定下载文件的文件类型
- inputName
  下载文件输入流的入口，在Action中定义一个方法，返回InputStream
- contentDisposition
  文件下载方式，直接显示文件还是保存。
- bufferSize
  下载文件时缓存大小。
