# Ajax In Struts2
## Ajax是什么
Ajax是 Asynchronous javaScript And xml 异步javaScript和Xml,整合了javaScript ，xml和css,通过javaScript的XMLHttpRequest对象异步发送请求到服务器，获取XML返回结果，再同通过javaScript操作dom元素，更新局部页面。
用表单或者超链接进行请求时，请求结果都是返回一个新的html页面，更新页面所有内容，不不是局部更新。使用Ajax技术，不用每次都更新整个网页,在整体网页保持不变的情况下，只更新局部。
### 核心技术
XMLHttpRequest是浏览器提供的一个javaScript对象，需要浏览器支持，可以通过window.XMLHttpRequest来判断浏览器是否支持XMLHttpRequest,如果支持，通过new XMLHttpRequest()创建一个XMLHttpRequest。
#### 常用方法
- abort()
  停止当前请求
- open(method,URL,async);
  建立与服务器连接，method指定请求方法，URL指定请求的地址，async指定是否使用异步请求。
- send(content)
  发送请求，content指定请求的参数
- setRequestHeader(header value)
  设置请求头的信息
- gerResponseHeader(key)
  获取返回的headers中的单个header值
- getAllReponseHeader()
  获取所有返回头
#### 常用属性
- onreadystatechange
  XMLHttpRequest对象状态发生变化时，会触发onreadystatechange所指定的函数。
- readyState
  XMLHttpRequest的状态信息，是一个Integer
  - 0
    初始化
  - 1
    读取中
  - 2
    已读取
  - 3
    交互中
  - 4
    已完成请求
- status
  HTTP 返回状态码，仅当readyState为3或4时，才有status
- responseText
  相应文本
- responseXML
  响应的XML文档对象
## Struts2中的Ajax标签
一般使用javaScript来使用ajax技术，不过struts提供了一些标签，不用写js可以使用ajax,在Struts2可以使用Dojo来使用Ajax。
### 依赖包
使用Dojo来进行Ajax操作

```xml
<!-- https://mvnrepository.com/artifact/org.apache.struts/struts2-dojo-plugin -->
     <!-- dojo 依赖-->
<dependency>
  <groupId>org.apache.struts</groupId>
  <artifactId>struts2-dojo-plugin</artifactId>
  <version>2.2.3</version>
</dependency>
```
jsp中需要引入Dojo
```xml
<!--  引入dojo库-->
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!-- 引入dojo的css和技js脚本 -->
<sx:head/>
```
### 主要标签
#### <sx:div>
创建一个div区，通过ajax向其中加载内容，以实现局部刷新
#### <sx:a>
通过Ajax更新某个元素的内容或提交表单
## 一个简单的Ajax程序
在前端使用js脚本执行Ajax请求，Action取出用户请求的数据，并将其转换为JSON返回给前端，前端使用js解析json数据，显示数据。详见代码。
