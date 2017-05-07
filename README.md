目录
- [Action](#Action)
  - [Action实现方式](#Action实现方式)
    - [POJO实现](#POJO实现)
    - [实现Action接口](#实现Actiion接口)
    - [继承ActionSupport](#继承ActionSupport)
  - [exceute()方法](#exceute()方法])
  - [访问ServletAPI](#访问ServletAPI)
    - [通过ActionContext访问](#通过ActionContext访问)
    - [通过ServletActionContext](#通过ServletActionContext)
    - [通过ServletActionContext](#通过ServletActionContext)
  - [Action方法调用](#Action方法调用)
    - [动态方法调用](#动态方法调用)
    - [method调用](#method调用)
    - [通配符调用](#通配符调用)
  - [Action获取表单数据](#Action获取表单数据)
    - [字段驱动](#字段驱动)
    - [域对象字段驱动](#域对象该字段驱动)
    - [域对象字段驱动](#域对象字段驱动)

# learn struts
Action and Result
## Code
```
git checkout ch3
```
## Action
用来处理一次用户请求的对象。主要作用
- 为给定的请求做必要的准备
- 数据交换中心
- 帮助框架决定返回结果
### Action实现方式
一般情况下，继承ActionSupport，重写exceute()。
#### POJO实现
可以使用Plain Ordianry Java Object实现，在POJO中，提供一个默认无参构造方法，以及一个execute()方法。
- Action示例
```java
public class POJOAction {
    public POJOAction(){

    }
    public String execute() throws Exception {
        System.out.println("基于POJO实现 Action ");
        return  "success";

    }
}
```
其他配置文件见代码
#### 实现Action接口
实现com.opensymphony.xwork2.Action接口
- Acion示例
```java
public class SecondAction implements Action{
    public String execute() throws Exception {
        System.out.println("实现Action接口来实现 Action");
        return SUCCESS;
    }
}
```
#### 继承ActionSupport
Action接口提供的功能比较少，一般继承ActionSupport来实现Action
- Action示例
```java
public class ThirdAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
        System.out.println("继承ActionSupport实现的Action ");
        return SUCCESS;
    }
}
```
### exceute()方法
默认情况下，execute()处理用户请求，一般在execte()完成如下工作
- 获取用户请求数据
- 处理用户请求数据，交由逻辑层处理
- 准备展示页面所需要的数据，保存数据
- 转向显示页面。
### 访问ServletAPI
Action 已经与Servlet完成分离，如果要用到Servelt,以下方法可以获取到Servlet。
#### 通过ActionContext访问
ActionContext是Action执行的上下文，存放Action执行所需要的对象。
- 常用方法
```java
//通过Key查找当前Context中的直
Object get(String key )
//向当前Context中增加值
void put(Strin key ,Obejct value)
Map getApplication()
static ActionContext getContext()
Map getParameters()
Map getSession()
void setApplicaion(Map applicaiton)
void setSession()
```
- 实例代码
见PojoAction.java
#### 通过特定xxxAware接口访问
- 接口i偶
  - ServletContextAware:获取ServletcContext实例
  - ServletRequestAware:获取用户请求的HttpServletRequest实例
  - ServletResponseAware:获取服务器响应的HttpServletResponse实例
- 实例
见SecondAction
#### 通过ServletActionContext
通过访问ServletActionContex中的静态方法来访问相关API
- 部分静态方法
```java
public static HttpServletRequest getRequest()
public static HttpServletResponse getResponse()
public static ServletContext getServletContext()
public static PageContext getPageContext()
```
- 实例代码
见ThirdAction
### Action方法调用
一个Action里可以有多个方法处理用户请求,需要在struts.xml配置请求调用的方法。
#### 动态方法调用
struts.xml配置
```xml
<action name="Actio Name " class="class name ">
  <result>result </result>
</action>
```
调用，通过!连接Action和要执行的方法
```xml
url = ActioName!MethodName
```
使用动态调用，可以用URL执行Action的任意方法，会带来安全隐患。在配置文件中，可以配置禁止使用动态方法
- 配置禁止使用动态方法
```xml
<constant name="struts.enable.DanamicMethodInvocation" value="false" />
```
#### method调用
- 配置文件
在action的配置文件总增加method
```xml
<!-- 调用默认的execute() -->
<action name="MethodAction" class="me.caofeng.actions.MethodAction">
    <result name="success">/methodResult.jsp</result>
</action>

<!-- 调用 getName()-->
<action name="GetNameAction" class="me.caofeng.actions.MethodAction" method="getName">
    <result name="success">/methodResult.jsp</result>
</action>

<!-- 调用 updateName()-->
<action name="UpdateNameAction" class="me.caofeng.actions.MethodAction" method="updateName">
    <result name="success">/methodResult.jsp</result>
</action>
```
- Action
```java
public class MethodAction extends ActionSupport implements ServletRequestAware{

    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {
        request.setAttribute("message"," default method execute() ");
        return SUCCESS;
    }


    public String getName(){
        request.setAttribute("message","getName() ,get name from server");
        return SUCCESS;
    }

    public String updateName(){
       request.setAttribute("message","updateName() ,update name ");
       return SUCCESS;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
```

#### 通配符调用
如果方法比较多，通过method配置会比较繁琐，可以使用通配符实现，减少配置数量。
通配符类似于正则表达式，用(\*)来表示，用于配置0个或多个字符串，使用通配符要有统一的约定。
- 配置文件
```xml
<!-- *可以有多个，用_连接 ，如name="*_* ,{1}表示取*号所代表的内容，有多个*号，按顺序取，如{1}，{2}-->
<action name="*Action" class="me.caofeng.actions.ManyAction" method="{1}">
    <result name="success">/methodResult.jsp</result>
</action>
```
- Action
```java
public class ManyAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest request;

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String execute() throws Exception {
        request.setAttribute("message", " default method execute() ");
        return SUCCESS;
    }

    public String get() {
        System.out.println("通配符调用get");
        request.setAttribute("message", "通配符调用getName() ,get name from server");
        return SUCCESS;
    }

    public String update() {
        System.out.println("通配符调用update");
        request.setAttribute("message", "通配符调用updateName() ,update name ");
        return SUCCESS;
    }

}
```
### 配置默认Action
配置默认Action，如果用户访问的Action不存在，则会转向默认Action
- 配置
```xml
<default-action-ref name="DefaultAction"/>
<action name="DefaultAction" class="me.caofeng.actions.DefaultAction">
  <result name="success">/index.html</result>
      <result name="error">/index.html</result>
</action>
```
### Action获取表单数据
Action用于处理用户请求，用户请求时，会携带一些参数，通过HTTP/HTTPS协议传输过来，放在请求URL中，如GET请求，或者在请求体中，如POST请求。web容器会将用户请求转换成一个HttpServletRequest对象，使用Servlet的时候，通过获取request对象来获取用户请求数据。在Struts2中，也可以通过request对象来获取用户请求数据，不过Struts2已经做了预处理,可以使用字段驱动方式，域对象字段驱动或模型驱动来获取用户请求参数。
#### 字段驱动
直接在Action中定义和form表单数据同名的字段，使这些字段同表单数据相对象。Struts核心控制器在处理时，会将其表单数据复制给这些同名字段。
- Action
```java
public class LoginAction extends ActionSupport {
    private String name;
    private String password;

    public LoginAction() {
    }

    public LoginAction(String name, String password) {
        this.name = name;
        this.password = password;
    }
    //...gettter and settter
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name", name);
        request.setAttribute("password", password);
        return SUCCESS;
    }
}
```
- from表单
```html
<form action="LoginAction" method="post">
  <input type="text" name="name"/>
  <input type="password" name="password"/>
  <input type="submit" value="登录"/>
</form>
```
#### 域对象字段驱动
如果表单数据过多，使用字段驱动时，Action中会有很多字段，使得Action比较臃肿，可以将表单数据封装证一个对象，在Action中持有一个对象，Struts2会把表单数据映射到对象中。
- Pojo对象
```java
public class User {
    private String name;
    private String password;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    //...getter and setteer
}
```
- Action
```java
public class LoginAction extends ActionSupport {
    private User user;
    public LoginAction() {
    }

    public LoginAction(User user) {
        this.user = user;
    }

    //..getter and setter

    @Override
  public String execute() throws Exception {
      HttpServletRequest request = ServletActionContext.getRequest();
      request.setAttribute("name", user.getName());
      request.setAttribute("password", user.getPassword());
      return SUCCESS;
  }
```
- form表单
需要将表单name属相指定为对象名.属性名。
```html
<form action="LoginAction" method="post">
  <input type="text" name="user.name"/>
  <input type="password" name="user.password"/>
  <input type="submit" value="登录"/>
</form>
```
#### 模型驱动
实现ModelDriven<T>接口，将表单数据传递给Driven中的JavaBean对象，javaBean对象要提供默认无参构造方法。
- Pojo对象
```java
public class User {
    private String name;
    private String password;

    public User() {

    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    //...getter and setteer
}
```
- Action
public class LoginAction extends ActionSupport implements ModelDriven<User> {

    // 需要创建一个型的对象
    private User user = new User();
    public LoginAction() {
    }

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("name", user.getName());
        request.setAttribute("password", user.getPassword());
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
- form表单
```html
<form action="LoginAction" method="post">
  <input type="text" name="name"/>
  <input type="password" name="password"/>
  <input type="submit" value="登录"/>
</form>
```
