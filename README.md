# File Upload And Download
## How To Upload File (文件上传原理)
网络传输以数据流为基础，在处理form表单的时候，可以设置form表单的enctype属性，
设置不同的属性，浏览器会以不同的方式处理表单数据，服务端根据其属性进行响应的处理。
属性有3个常用的值。
- application/x-www-form-urlencoded 
    默认属性，只处理表单里的value属性，将value进行URL编码，然后上传到服务器。
- 
