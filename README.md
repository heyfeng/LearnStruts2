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
将代码
## 自定义类型转换器
### 使用步骤
1. 继承StrutsTypeConverter,实现convertFromString()和convertToString()方法，写转换逻辑
```java
/**
   * Converts one or more String values to the specified class.
   *
   * @param context the action context
   * @param values  the String values to be converted, such as those submitted from an HTML form
   * @param toClass the class to convert to
   * @return the converted object
   */
public abstract Object convertFromString(Map context, String[] values, Class toClass);

/**
   * Converts the specified object to a String.
   *
   * @param context the action context
   * @param o       the object to be converted
   * @return the converted String
   */
public abstract String convertToString(Map context, Object o);

```
2. 配置转换器
在struts.xml所在目录下，新建一个xwork-conversion.properties文件，配置需要转换实体类和对象的转换器
```xml
实体类名字=转换器类名字
```
### 实例
日期转化器实例，用户输入的字符串日期转换为java.util.Date
- DateConver.java
```java
public class DateConvert extends StrutsTypeConverter {
    //支持多种日期格式转换
    private final DateFormat[] dateFormats = {
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yy/MM/dd"),
            new SimpleDateFormat("MM/dd/yy")
            //if you like ,can add  more
    };

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/8 21:19
     * @Description: 将指定格式字符串转为日期类型
    */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) throws TypeConversionException{
        //获取日期的字符串
        String dateStr = values[0];
        System.out.println("时间转换器 " + dateStr);
        int size = dateFormats.length;
        // 遍历预定的日期格式，进行转换
        for (int i = 0 ; i < size ; i ++ ){
            try {
                return dateFormats[i].parse(dateStr);
            } catch (ParseException e) {
                continue;
            }
        }
        //如果转换失败，抛出异常
        throw new TypeConversionException();
    }

    @Override
    public String convertToString(Map context, Object o) {
        Date date = (Date) o;
        String dates =  new SimpleDateFormat("yyyy-MM-dd").format(date);
        return dates;
    }
}
```
- xwork-conversion.properties
```xml
java.util.Date=me.caofeng.convert.DateConvert
```
- 其他配置，将代码
