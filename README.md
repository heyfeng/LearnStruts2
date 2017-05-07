# learn struts
code and note for struts
## a simple interceptor
a simple interceptor ,calculation an Action execute time.
### The Interceptor
TimeInterceptor.java
```java
public class TimeInterceptor extends AbstractInterceptor{
    public String intercept(ActionInvocation invocation) throws Exception {
        //记录系统当前时间
        long start = System.currentTimeMillis();
        System.out.println("Action开始 " + start );
        String result = invocation.invoke();
        //记录系统当前时间
        long end = System.currentTimeMillis();
        System.out.println("Action结束 " + end);
        //计算Action执行时间 
        long time = end - start;
        System.out.println("Action执行时间 " + time + " ms ");
        return result;
    }
}
```
### The struts.xml
```xml
<package name="default" namespace="/" extends="struts-default">
    <!-- 定义拦截器-->
    <interceptors>
        <!-- name 指定拦截器的名字 class指定拦截器对应的类,拦截器具体实现-->
        <interceptor name="TimeInterceptor" class="me.caofeng.interceptor.TimeInterceptor"/>
    </interceptors>
        <!-- 配置动作 name指定动作的名称，在jsp或html中读访问的地址，class指定动作的实现类-->
    <action name="HelloAction" class="me.caofeng.actions.HelloAction">
        <!-- 实现逻辑视图和物理视图的映射 action要返回一个字符串，name指定接收的字符串名字，
        如果返回的结果和name匹配，则将相应的jsp页面返回个客户端-->
        <result name="success">/hello.jsp</result>
        <!-- 使用Struts2 默认拦截器，Struts2有很多默认拦截器，而且Struts2的很多工作都是由拦截器实现的-->
        <interceptor-ref name="defaultStack"/>
        <!-- 应用自定义的拦截器 -->
        <interceptor-ref name="TimeInterceptor"/>
    </action>
</package>

```
