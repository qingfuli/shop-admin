<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

<t:layout title="添加手机">
	<h1>添加手机</h1>
	<form:form action="" method="POST" commandName="cellphoneForm">
		<sec:csrfInput/>
		<div>
			<form:label path="name">名字：</form:label>
			<form:input path="name" id="name"/>
			<form:errors path="name" ></form:errors>
		</div>
		
		<div>
			<form:label path="description">描述：</form:label>
			<form:input path="description" id="description"/>
			<form:errors path="description" ></form:errors>
		</div>
		
		<div>
			<form:label path="price">价格：</form:label>
			<form:input path="price" id="price"/>
			<form:errors path="price" ></form:errors>
		</div>
		
		<div>
			<form:label path="brand">品牌：</form:label>
			<form:input path="brand" id="brand"/>
			<form:errors path="brand" ></form:errors>
		</div>
		
		<div>
			<form:label path="model">型号：</form:label>
			<form:input path="model" id="model"/>
			<form:errors path="model" ></form:errors>
		</div>
		
		<div>
			<form:label path="os">操作系统：</form:label>
			<form:input path="os" id="os"/>
			<form:errors path="os" ></form:errors>
		</div>
		
		<div>
			<form:label path="cpuBrand">CPU型号：</form:label>
			<form:input path="cpuBrand" id="cpuBrand"/>
			<form:errors path="cpuBrand" ></form:errors>
		</div>
		
		<div>
			<form:label path="ram">内存：</form:label>
			<form:input path="ram" id="ram"/>GB
			<form:errors path="ram" ></form:errors>
		</div>
		
		<div>
			<form:label path="storage">存储容量：</form:label>
			<form:input path="storage" id="storage"/>GB
			<form:errors path="storage" ></form:errors>
		</div>
		
		<div>
			<form:label path="color">颜色：</form:label>
			<form:input path="color" id="color"/>
			<form:errors path="color" ></form:errors>
		</div>
		
		<div>
			<button type="submit">提交</button>
		</div>
	
	</form:form>
</t:layout>
