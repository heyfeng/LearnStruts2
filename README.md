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
### Action实现
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
## Result
Result是Action执行后返回的一个字符串，指示Action执行完成后要显示的页面。
