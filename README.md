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
例子，见register.jsp
