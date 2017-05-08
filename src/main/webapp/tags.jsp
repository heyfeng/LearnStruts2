<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<s:bean id="myComparator" name="me.caofeng.util.MyComparator" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 Demo None UI Tag</title>
</head>
<body>
    <h2>Struts2 Demo 非UI TAG</h2>

    <div>
        <h3>条件分支</h3>
		<s:if test="2 == 1">
			<p>条件 1==1</p>
		</s:if>
		<s:elseif test="2 == 1">
			<p>条件 1 != 1</p>
		</s:elseif>
		<s:else>
			<p>其他条件</p>
		</s:else>
    </div>
    
    <div>
        <h3>迭代Iterator</h3>
       	<hr/>
        <p>迭代数组</p>
		<s:iterator 
			value="{'1一','2二','3三','4四','5五','6六'}"
			var = "item">
			<p>
				<s:property value="item"/>
			</p>
		</s:iterator>
		<hr/>
		<p>迭代Map</p>
		<s:iterator 
			value="#{'1001':'Java','1002':'Jsp','1003':'J2EE'}"
			var = "item">
			<p>
				<s:property value="key"/>
				<s:property value="value"/>
			</p>
		</s:iterator>
		<hr/>
		
		<p>获取索引</p>
		<table border="1">
			<tr >
				<td>序号</td>
				<td>书名</td>
			</tr>
			
			<s:iterator
			 	value="{'百年孤独','血鹦鹉','陆小凤','天地歌'}"
			 	var = "book"
			 	status="stat">
			 	<tr>
				 	<s:if test="#stat.index%2==0">
				 		<td>
				 			<s:property value="#stat.count"/>
				 		</td>
				 		<td style="background-color: red;">
				 			<s:property value="book"/>
				 		</td>
				 	</s:if>
				 	<s:else>
				 		<td>
				 			<s:property value="#stat.count"/>
				 		</td>
				 		<td style="background-color: gray">
				 			<s:property value="book"/>
				 		</td>
				 	</s:else>
			 	</tr>
			</s:iterator>
		</table>	
    </div>
    
    <hr/>
    <div>
    	<p>append 组合</p>
    	<s:append var="poem">
    		<s:param value="{'古郎月行','唐 李白'}"></s:param>
    		<s:param value="{'床前明月光','疑是地上霜'}"></s:param>
    		<s:param value="{'举头望明月','低头思故乡'}"></s:param>
    	</s:append>
    	<s:iterator value="%{#poem}" var="sentence">
    		<p>
    			<s:property value="sentence"/>
    		</p>	
    	</s:iterator>
    </div>
    <hr/>
    <div>
    	<p>merger 合并</p>
    	<s:merge var="poem">
    		<s:param value="{'古郎月行','唐 李白'}"></s:param>
    		<s:param value="{'床前明月光','疑是地上霜'}"></s:param>
    		<s:param value="{'举头望明月','低头思故乡'}"></s:param>
    	</s:merge>
    	<s:iterator value="%{#poem}" var="sentence">
    		<p>
    			<s:property value="sentence"/>
    		</p>	
    	</s:iterator>
    </div>
    <hr/>

    <div>
        <p>sort排序</p>
        <s:sort
            comparator="#myComparator"
            id="fruit"
            source="{'orange','apple','pear'}"/>
         <s:iterator
            value="#attr.fruit"
            var = "item">
                <s:property value="item"/>
          </s:iterator>

    </div>

    <hr/>

    <div>
        <p>generator  分割字符串</p>
        <s:generator separator="," val="'北京,天津,上海,重庆'" id="city"/>
        <p>原字符串北京,天津,上海,重庆<p>
        <p>分割后的字符串</p>
        <s:iterator value="#attr.city" var= "item">
            <p>
                <s:property value="item"/>
            </p>
        </s:iterator>
    </div>

    <hr/>
    <div>
        <p>subset 子集</p>
        <s:subset source="{'北京','上海','天津','重庆'}" var="city" start="1" count="3"/>
        <s:iterator value="#attr.city" var="item">
            <p>
                <s:property value="item"/>
            </p>
        </s:iterator>
    </div>
</body>
</html>