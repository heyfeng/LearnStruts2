# OGNL Object Graph Navigation Language
在Servlet开发中，如果要获取用户提交的数据，需要从request对象中
获取parameter参数,然后转换成所需要的数据类型。在Struts2中，直接在
Action中定义和表单字段同名的字段即可获取到表单数据。在Struts2中，使用
OGNL对表单数据进行了转换和转移。
在Struts2中，OGNL主要用于表达式语言和类型转化器。
## ONGL表达式
表达式要结合Struts标签使用
### #的三种用途
#### 访问非根对象属性
例如session对象中有一个msg的属性，使用#session.msg相当于session.getAttibute("msg")
#### 过滤和投影集合
如persons.{?#this.age > 20}
#### 构造Map
```
"#{'key1':'value1','key3':'value2','key3':'value3'}"
```
### %的作用
告诉执行环境%{}里是OGNL表达式
### 实例
