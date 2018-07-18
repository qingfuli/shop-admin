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
/* .menu {
    display: inline-block;
} */

</style>

    <!-- Le styles -->
    <link href="http://fonts.googleapis.com/css?family=Oxygen|Marck+Script" rel="stylesheet" type="text/css">
    <link href="${contextPath}/assets/css/bootstrap.css" rel="stylesheet">
    <link href="${contextPath}/assets/css/font-awesome.css" rel="stylesheet">
    <link href="${contextPath}/assets/css/admin.css" rel="stylesheet">

</head>
<body>

	<div class="container">
		
		<div class="row">
			<div class="span2">
		
				<div class="main-left-col" id="header">
					<h1><i class="icon-shopping-cart icon-large"></i> Admin</h1>
			
					<ul class="side-nav">

						<li class="active">
							<a href="index.html"><i class="icon-home"></i> Dashboard</a>
						</li>
						<!-- 用户管理 -->
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" href="#"><i class="icon-sitemap"></i> 用户管理 <b class="caret"></b></a>
<!-- 							<ul id="website-dropdown" class="collapse">
								<li><a href="listing.html">Pages</a></li>
								<li><a href="listing.html">Menus</a></li>
							</ul> -->
						</li>
						<!-- 订单管理 -->
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" href="#"><i class="icon-sitemap"></i> 订单管理 <b class="caret"></b></a>
<!-- 							<ul id="website-dropdown" class="collapse">
								<li><a href="listing.html">Pages</a></li>
								<li><a href="listing.html">Menus</a></li>
							</ul> -->
						</li>
						<!-- 商品管理 -->
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" href="#"><i class="icon-sitemap"></i> 商品管理 <b class="caret"></b></a>
 							<ul id="website-dropdown" class="collapse">
								<li><a href="${contextPath }/cellphones/add">商品列表</a></li>
								<li><a href="${contextPath }/cellphones/">添加商品</a></li>
							</ul>
						</li>
						<!-- 评论管理 -->
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" href="#"><i class="icon-sitemap"></i> 评论管理 <b class="caret"></b></a>
<!-- 							<ul id="website-dropdown" class="collapse">
								<li><a href="listing.html">Pages</a></li>
								<li><a href="listing.html">Menus</a></li>
							</ul> -->
						</li>
						<!-- 商品目录管理 -->
						<li class="dropdown">
							<a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" href="#"><i class="icon-sitemap"></i> 商品目录管理 <b class="caret"></b></a>
<!-- 							<ul id="website-dropdown" class="collapse">
								<li><a href="listing.html">Pages</a></li>
								<li><a href="listing.html">Menus</a></li>
							</ul> -->
						</li>
					</ul>
				</div>
		
			</div>
			
			<div class="span10">

				<div class="secondary-masthead">

					<ul class="nav nav-pills pull-right">
						<li><a href="#"><i class="icon-globe"></i> View Website</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#"><i class="icon-user"></i>
								John Smith <b class="caret"></b> </a>
							<ul class="dropdown-menu">
								<li><a href="profile.html">Your Profile</a></li>
								<li class="active"><a href="form.html">Account Settings</a></li>
								<li class="divider"></li>
								<li><a href="">Logout</a></li>
							</ul></li>
					</ul>

				</div>
				
				<div class="main-area dashboard">

					<div class="context">
						<h1>手机列表</h1>
						<jsp:doBody />
					</div>
					<div class="row">

						<div class="span10 footer">

							<p>&copy; Website Name 2014</p>

						</div>

					</div>
				</div>
			</div>
		</div>
		
	</div>
<%-- 	<div class="header">
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
	</div> --%>
	
<%-- 	<div class="context">
		<h1>手机列表</h1>
		<jsp:doBody />
	</div>
	
	<div class="footer">
		TODO copyright 2018
	</div> --%>
<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${contextPath}/assets/js/jquery.min.js"></script>
<script src="${contextPath}/assets/js/bootstrap.js"></script>
<script src="${contextPath}/assets/js/excanvas.min.js"></script>
<script src="${contextPath}/assets/js/jquery.flot.min.js"></script>
<script src="${contextPath}/assets/js/jquery.flot.resize.js"></script>
</script>
</body>
</html>
</html>