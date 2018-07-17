<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>手机列表</title>

<style type="text/css">
.menu {
    display: inline-block;
}

</style>
</head>
<body>
	<div class="header">
		<ul class="menu">
			<li>用户管理</li>
		</ul>
		<ul class="menu">
			<li>订单管理</li>
		</ul>
		<ul class="menu">
			<li>商品管理</li>
			<li><a href="${contextPath }/cellphones/add">添加商品</a></li>
			<li><a href="${contextPath }/cellphones/">商品列表</a></li>
			<li>查找商品</li>
		</ul>
		<ul class="menu">
			<li>评论管理</li>
		</ul>
		<ul class="menu">
			<li>商品目录管理</li>
		</ul>
	</div>
	
	<div class="context">
		<h1>手机列表</h1>
		<jsp:doBody />
	</div>
	
	<div class="footer">
		TODO copyright 2018
	</div>

</body>
</html>