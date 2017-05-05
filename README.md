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
- POJO示例
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
## Result
Result是Action执行后返回的一个字符串，指示Action执行完成后要显示的页面。
