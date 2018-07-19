<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<t:layout title="手机列表">
	<h1>手机列表</h1>
	
	<form:form action="${contextPath }/cellphones/search" method="GET" commandName="searchCondition">
		<sec:csrfInput/>
		<div>
			<form:label path="brand">品牌：</form:label>
			<form:input path="brand" id="brand"/>
		</div>
		
		<div>
			<form:label path="os">操作系统：</form:label>
			<form:input path="os" id="os"/>
		</div>
		
		<div>
			<form:label path="ramMin">内存：</form:label>
			<form:input path="ramMin" id="ram-min"/>GB - 
			<form:input path="ramMax" id="ram-max"/>GB
		</div>
		
		<div>
			<button type="submit">提交</button>
		</div>
	</form:form>
	
	
	<ul>
		<c:forEach items="${cellphones }" var="cellphone">
		<li>
		${cellphone.id } ${cellphone.name } 
		<a href="${contextPath }/cellphones/${cellphone.id}/edit">修改</a>
		<a href="${contextPath }/cellphones/${cellphone.id}/delete">删除</a>
		</li>
		</c:forEach>
	</ul>
</t:layout>
