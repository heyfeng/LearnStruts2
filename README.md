# Validate frame 校验框架
## 为什么要校验
总之，你不希望用户往你得服务器里塞进一堆shit，那就对用户请求进行校验巴。
校验，主要是对用户请求数据校验，服务端应该坚信的一点是客户端的数据都是
不安全的。校验分为前端校验和后端校验。在web端，前端校验主要靠js，在发
送请求前进行校验，校验成功后再先服务端发送请求。当然，用户可能绕过前端
校验，比如直接调用接口，这个时候就需要进行后端校验了，再进行处理前，先对
用户请求进行校验，校验通过，再进行后续处理，如果没通过，告诉用户失败原因。
## Servlet中校验。
以登录为例，在servlet中实现简单的校验。
- Servlet代码
```java
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String password = request.getParameter("password");

    //验证用户名和密码是否为空
    if (ValidateUtil.isEmpty(name) || ValidateUtil.isEmpty(password)){
       error(request,response);
    }

    System.out.println("用户名 "+name +" 密码 " + password );
        //检查用户名是否包含中文
    if (ValidateUtil.isContainChinese(name)){
       error(request,response);
    }

        //检查密码是否符合要求
    if (ValidateUtil.isDigit(password) || password.length() < 6){
       error(request,response);
    }

    if ("admin".equals(name) && "admin123".equals(password)){
       request.setAttribute("name",name);
       request.setAttribute("password",password);
       request.getRequestDispatcher("success.jsp").forward(request,response);
    }else{
        error(request,response);
    }
}

public void error(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("error","用户名或密码错误");
    request.getRequestDispatcher("login.jsp").forward(request,response);
}

```
## Struts2中校验
以登录为例，在Struts2中做校验，不使用框架提供的校验支持
- Action代码
```java
@Override
public String execute() throws Exception {
     //验证用户名和密码是否为空
    if (ValidateUtil.isEmpty(name) || ValidateUtil.isEmpty(password)){
        request.setAttribute("error","用户名或密码错误");
        return INPUT;
    }

    System.out.println("用户名 "+name +" 密码 " + password );
    //检查用户名是否包含中文
    if (ValidateUtil.isContainChinese(name)){
        request.setAttribute("error","用户名或密码错误");
        return INPUT;
    }

    //检查密码是否符合要求
    if (ValidateUtil.isDigit(password) || password.length() < 6){
        request.setAttribute("error","用户名或密码错误");
        return INPUT;
    }

    if ("admin".equals(name) && "admin123".equals(password)){
        request.setAttribute("name",name);
        request.setAttribute("password",password);
        return SUCCESS;
    }else{
        request.setAttribute("error","用户名或密码错误");
        return INPUT;
    }
}
```
## 借助Struts2验证功能实现验证
### 重写validate()来实现验证
把验证逻辑放在validate()中，excute()中执行验证成功之后的逻辑,详见代码。
### 重写validateXXX()
重写validate()的话，会验证Action里所有处理用户请求的方法，如果只验证某个方法，则需要重写validateXXX()，详见代码。
### 验证框架
Struts拥有完整的校验框架，使用校验框架，可以很方便的进行校验。
#### 编写校验规则文件
校验文件是一个xml文件，文件名格式为AcitonName-validation.xml。ActionName为要处理的Acion,-validation.xml为固定格式。校验文件需要添加xml规范，DTD以及根目录信息,代码如下。
校验文件要和Action文件放在同一目录下。在idea中，在resources目录建一个和Action路径同名的目录，将文件放在该目录下，便于管理。
```xml
<?xml version="1.0"?>
<!DOCTYPE validators PUBLIC
          "-//Apache Struts//XWork Validator 1.0.2//EN"
          "http://struts.apache.org/dtds/xwork-validator-1.0.2.dtd">
<validators>
  <!--  对字段编写校验规则-->
</validators>
```
#### 校验器的配置
##### 字段校验配置
依次对所有字段完成所有校验，一个字段可以配置多个校验规则
```xml
<validators>  
    <field name="FIELD_NAME">  
        <field-validator type="VALIDATOR_TYPE">  
            <param name="PARAM">VALUE</param>  
            <message>MESSAGE</message>  
        </field-validator>  
    </field>  
</validators>
```
- FIELD_NAME
  要校验的字段的名字
- VALIDATOR_TYPE
  校验器类型，Struts2内置了很多校验器
- PARAM
  校验器参数
- VALUE
  校验器值
- MESSAGE
  校验失败显示的提示信息
##### 非字段校验器配置
```xml
<validator type="VALIDATOR_TYPE">  
        <param name="FIELD_NAME">FIELD_NAME</param>  
        <param name="PARAM">VALUE</param>  
        <message></message>  
</validator>
```
- VALIDATOR_TYPE
  校验器类型，Struts2内置了很多校验器
- FIELD_NAME
  要校验的字段的名字,必填参数
- PARAM
  校验器参数
- VALUE
  校验器值
- MESSAGE
  校验失败显示的提示信息
##### 内建验证规则(VALIDATOR_TYPE)
- requiredstring validator
  非空校验器，指定字段不能为空
- stringlength validator
  长度校验器，校验字段长度，
  - maxLength
    指定最大值
  - minLength
    指定最小值
  -
  ```xml
  <!-- 验证类型 字段长度 -->
  <field-validator type="stringlength">
    <!-- 最大长度-->
    <param name="maxLength">15</param>
    <!-- 最小长度-->
    <param name="minLength">6</param>
    <message>用户名长度为6-15个字符</message>
  </field-validator>
  ```
- email validator
  邮箱验证器，验证字段是否是正确的邮箱格式地址
- regex validator
  正则表达式验证器，其param参数必须为regex
  ```xml
  <!-- 使用正则表达式 -->
  <field-validator type="regex">
      <param name="regex">REGEX</param>
      <message>MESSAGE</message>
  </field-validator>
  ```
- conversion validator
  转换验证器
- date validator
  日期验证器
- double validator
  浮点验证器
- expression validator
  表达式验证器,不能用在字段校验配置中
- fieldexpression validator
  字段表达式验证器,字段OGNL表达式校验器,要求field满足一个ognl表达式,expression参数指定ognl表达式,该逻辑表达式基于ValueStack进行求值,返回true时校验通过,否则不通过
- int validator
  整型验证器
- required validator
  非空验证器
