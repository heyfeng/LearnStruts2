<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo Register</title>
</head>
<body >
    <center>
    <h2>注册等级表</h2>
    <s:form action="register" method="post">
        <s:textfield name="name" label="name"/>
        <s:password name="password" label="password"/>
        <s:select name="degree" label="Education" list="{'高中以下','专科','本科','研究生及以上'}"/>
        <s:radio name="gender" label="gender" list="{'男','女'}"/>
        <s:textarea name="protocol" label="protocol" value="no fuck protocol"/>
        <s:checkbox name="agree" label="agree with the protocol"/>
        <s:checkboxlist
            name="activity"
            label="你的喜欢什么运动？"
            labelposition="top"
            list="{'篮球','足球','网球','羽毛球'}"
        />

        <s:combobox
            name="music"
            label="你喜欢的音乐"
            maxlength="20"
            list="{'摇滚','民谣','乡村','布鲁斯'}"
            headerKey="-1"
            headerValue="---请选择---"
            emptyOption="false"
            value="摇滚"
         />

         <s:select
            label="你喜欢什么样的小说"
            name="book"
            list="{'百年孤独','血鹦鹉'}">
            <s:optgroup
                label="古龙"
                list="#{'七种武器':'不错','陆小凤传奇':'还行'}"
                listKey="key"
                listValue="key"
             />
            <s:optgroup
                label="马尔克斯"
                list="#{'霍乱时期的爱情':'没看懂','家长的没落':'没看过'}"
                listKey="key"
                listValue="key"
             />
          </s:select>

         <s:doubleselect
               label="选择城市"
               name="province"
               list="{'北京市','上海市'}"
               doubleList="top='北京市'?{'东城区','西城区','海淀区','昭阳区'}:{'闸北区','静安区','普陀区','浦东新区'}"
               doubleName="city"
               />
        <s:file name="card"/>

        <s:updownselect
            name="fruit"
            label="你喜欢的水果"
            labelposition="left"
            moveUpLabel="上移"
            moveDownLabel="下移"
            selectAllLabel="全选"
            list="{'西瓜','苹果','橘子'}"/>

        <s:optiontransferselect
            label="你喜欢的歌手"
            name="manland"
            leftTitle="大陆歌手"
            rightTitle="港台歌手"
            multiple="true"
            list="{'许嵩','阿信','刀郎'}"
            leftDownLabel="下移"
            leftUpLabel="上移"
            addToLeftLabel="左移"
            addToRightLabel="右移"
            addAllToLeftLabel="全部左移"
            addAllToRightLabel="全部右移动"
            selectAllLabel="全部选择"
            headerKey="mlKey"
            headerValue="---选择大陆明星---"
            emptyOption="false"
            doubleName="hk"
            doubleList="{'周杰伦','林俊杰','陈奕迅'}"
            doubleHeaderValue="---选择港台明星---"
            doubleEmptyOption="false"
            doubleMultiple="true"
            rightDownLabel="下移"
            rightUpLabel="上移"
         />
        <s:token />
        <s:submit value="submit"/>
        <s:reset value="reset"/>
    </s:form>
    </center>
</body>
</html>