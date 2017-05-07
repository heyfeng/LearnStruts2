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
例子，见register.jsp
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
