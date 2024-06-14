<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="Css.css">
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.15.4/css/all.css">

<title>Đăng nhập</title>
</head>
<body>
	<div id="div0">
		<html:form action="/Login" style="max-width: 400px;background: rgba(0, 0, 0 , 0.8);flex-grow: 1;padding: 30px 30px 40px;box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);border-radius: 20px">
			<h1>Đăng Nhập</h1>
    			<div class="div1" style="border-bottom: 1px solid #fff;
	margin-top: 15px;
	margin-bottom: 20px;
	display: flex;">
      				<i class="far fa-user" style="color: #fff;
    font-size: 20px;
    padding-top: 5px;
    padding-right: 10px;"></i>	
					<html:text property="userName" style="background: transparent;border: 0;outline: 0; color: #f5f5f5;flex-grow: 1;" />
				</div >
				<div class="div1">
				<i class="fas fa-key"></i>
					<html:password property="passWord" style="background: transparent;border: 0;outline: 0;color: #f5f5f5;flex-grow: 1;"/>
				</div>
					<html:submit value="Đăng nhập" style="background: transparent; border: 1px solid #f5f5f5; color: #fff; width: 100%; text-transform: uppercase; padding: 6px 10px; transition: 0.25s ease-in-out; margin-top: 30px;" onmouseover="this.style.border='1px solid #54a0ff'" onmouseout="this.style.border='1px solid #f5f5f5'"/>
		</html:form>
		</div>
</body>

</html>