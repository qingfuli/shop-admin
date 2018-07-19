<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<t:layout title="用户列表">
	<h1>用户列表</h1>
	
	<ul>
		<c:forEach items="${operators }" var="operator">
		<li>
		${operator.id } ${operator.username } 
		<a href="${contextPath }/operators/${operator.id}/edit">修改</a>
		<a href="${contextPath }/operators/${operator.id}/delete">删除</a>
		</li>
		</c:forEach>
	</ul>
</t:layout>
