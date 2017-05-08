# Struts tag
要使用Struts tag，需要在Jsp页面中引入Struts tag lib
```xml
<%@ taglib prefix="s" uri="/struts-tags" %>
```
## Code
```
git checkout ch5
```
## 分类
### UI标签库
用来生成HTML元素
#### 表单标签
生成HTML页面的form元素，普通表单元素的标签
#### 非表单标签
生成页面上的树，Tab等标签
#### Ajax标签
用于Ajax支持的标签
### 非UI标签库
####  数据标签
提供数据访问的功能
#### 控制标签
完成条件逻辑，循环控制逻辑
## 表单标签
### 表单标签通用元素
|属性名|主题|数据类型|说明|
|--|--|--|--|
|title|simple|String|设置表单的title|
|disabled|simple|String|设置表单是否可用|
|label|xhtml|String|设置表单的label|
|labelPosition|xhtml|String|设置label显示位置，可选top,left(默认)|
|name|simple|String|设置name属性|
|value|simple|String|设置value属性|
|cssClass|simple|String|设置表单元素的class|
|cssStyle|simple|String|设置表单元素的style|
|required|xhtml|Boolean|设置表单是否必填|
|requiredPosition|xhtml|String|设置必填标记相对于label的位置|
### 简单表单标签
|标签|HTML对应标签|说明|
|--|--|--|
|<s:form>|form|表单标签|
|<s:textfield>|input type="text"|单行输入文本|
|<s:password>|input type="password"|密码输入框|
|<s:textarea>|textarea|文本框|
|<s:submit>|input type=submit|提交按钮|
|<s:reset>|input type=reset|重置按钮|
|<s:select>|select|下拉列表框|
|<s:radio>|input type=radio|单选框|
|<s:checkbox>|input type=checkbox|复选框|
### <s:checkboxlist>复选框
|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|name|false|无|String|复选框名称|
|label|false|无|String|复选框标签|
|list|true|无|String|复选框数据|
|listKey|false|无|String|复选框选项值|
|listValue|false|无|String|复选框显示文本|
### <s:combobox>单行文本和下拉选择组合框
|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|name|false|无|String|组合框名称|
|label|false|无|String|标签|
|list|true|无|String|复选框数据|
|headerKey|false|无|String|下拉选择框头部键|
|headerValue|false|无|String|下拉选择框头部值|
|emptyOption|false|无|Boolean|是否可有空值|
|value|false|无|String|下拉选择框的值|
### <s:optgroup>下拉组合列表
下拉列表分组，必须在下列表中使用

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|label|false|无|String|分组名字|
|list|true|无|String|分组数据|
|listKey|false|无|String|分组值|
|listValue|false|无|String|分组显示文本|
### <s:doubleSelect> 两级联动选择
两级联动选择框,必须在form表单中

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|label|false|无|String|选择框名字|
|list|true|无|String|一级选择框数据|
|name|false|无|Stirng|一级选择框键|
|doubleName|false|无|String|二级选择框键|
|doubleList|false|无|String|二级选择框数据|
### <s:file> 文件选择框
|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|accept|false|无|String|接收的文件类型|
### <s:token>
防止刷新时多次提交，是一个隐藏域
### <s:updownselect>列表选择框
列表选择框和按钮组合

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|label|false|无|String|组合选择框的名字|
|list|true|无|String|组合选择框数据|
|name|false|无|Stirng|组合选择框的键|
|moveUpLabel|false|无|String|上移标识|
|moveDownLabel|false|无|String|下移标识|
|selectAllLabel|false|无|String|全选标识|
### <s:optiontransferselect>左右转换框
|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|label|false|无|String|左右转换框的名字|
|name|false|无|Stirng|左边框的键|
|list|true|无|String|左边框数据|
|leftTitle|false|无|String|左边框题目|
|rightTitle|false|无|String|右边框题目|
|multiple|false|无|Boolean|左边框是否可以多选|
|leftUpLabel|false|无|String|左边上移|
|leftDownLabel|false|无|String|左边下移|
|rightUpLabel|false|无|String|右边上移|
|rightDownLabel|false|无|String|右边下移|
|addAllToLeftLabel|false|无|String|全部左移|
|addAllToRightLabel|false|无|String|全部右移|
|selectAllLabel|false|无|String|全选|
|doubleName|false|无|String|右边框的键|
|doubleLists|true|无|String|右边框的数据
## 控制标签
### 条件分支if，elseif,else
使用和Java条件分支一样。
```xml
<s:if test="条件表达式1">
  <p>标签内容</p>
</s:if>
<s:elseif test="条件表达式2">
	<p>标签内容</p>
</s:elseif>
<s:else>
	<p>标签内容</p>
</s:else>
```
### 迭代<s:iterator>
对集合数据进行迭代，集合包含List，Set,数组，Map

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|value|true|无|String|需要迭代的数据|
|var|false|无|String|设置集合元素的名字,在设置值的时候要用到|
|status|false|无|String|获取单点迭代元素的属性，比如是否是最后一个，索引|
|Begin|false|无|String|开始迭代的位置|
|End|false|无|String|结束迭代的位置|
|Step|false|无|String|迭代的步长|
### 添加<s:append>
将多个集合组合起来，组成一个新的集合，要指定var属性，组合时，按顺序将集合依次组合。
```xml
<s:append var="NAME">
    <s:param value="{}" ></param>
    ...更多参数
</s:append>
```

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|var|true|无|String|组合器的名字|
|param value|true|无|String|参与组合的数据|
### 拼接<s:merge>
将多个集合拼接在一起，先拼接各个集合的第一个元素，然后第二个元素，以此类推。

```xml
<s:merge var="NAME">
    <s:param value="{}" ></param>
    ...更多参数
</s:merge>
```

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|var|true|无|String|组合器的名字|
|param value|true|无|String|参与组合的数据|

###  排序<s:sort>
自定义比较器，对数据进行排序


```xml
<s:bean id="COMPARATORNAME" name="comparator class" />
<s:sort comparator="#COMPARATORNAME"
        id="ID"
        source="{}"/>
```

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|comparator|true|无|String|自定义的比较器，实现comparator接口|
|id|false|无|String|比较器ID|
|source|false|无|String|要排序的数据|

### 分割<s:generator>
```xml
<s:generator separator="," val="'北京,天津,上海,重庆'" id="city"/>
```

|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|separator|true|无|String|分割符号|
|val|true|无|String|要分割的字符串|
|converter|false|无|String|转换器|
|id|false|无|String|指定生成的集合保存到pageContext中|
|count|false|无|String|指定生成集合的数量|

### 子集<s:subset>
```xml
<s:subset source="{'北京','上海','天津','重庆'}" var="city" start="1" count="3"/>
```
|属性名|是否必须|默认值|类型|说明|
|--|--|--|--|--|
|source|false|无|String|原数据|
|var|false|无|String|指定生成的集合保存到pageContext中|
|count|false|无|String|子集的数量|
|start|false|无|String|子集开始索引|
## 数据标签
用于数据访问和Action调用

|标签|说明|
|--|--|
|<s:action>|调用Action|
|<s:property>|输出value属性的值|
|<s:param>|为其他标签提供参数|
|<s:bean>|在JSP页面创建JavaBean实例|
|<s:date>|格式化输出时间或日期|
|<s:set>|定义一个新的变量|
|<s:url>|生成URL地址|
|<s:include>|包含其他页面，类似JSPinlcude指令或动作|
