<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Style.css">
<title>Đăng nhập</title>
</head>
<body>
	<div id="div0">
	
		<html:form action="/login">
			<h1 style="display: flex; justify-content: center; align-items: center;">Đăng Nhập</h1>
			Tài khoản:<html:text property="userName" style=" margin: 10px;" />
			<br>
			Mật khẩu:<html:password property="passWord" style=" margin: 10px;"/>
			<br>
			<html:submit value="Đăng nhập" style="margin-left: 80px; margin-top: 10px;border-radius: 20px; padding: 5px; width: 150px;display: flex;justify-content: center;"/>
		</html:form>
		</div>
</body>

</html>
