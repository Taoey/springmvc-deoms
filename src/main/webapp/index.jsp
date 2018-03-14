<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String pageName="index";
pageContext.setAttribute("pageName", pageName);

%>
<ul>
	<li><a href="${ pageName }/login">跳转到登录页面</a></li>
	<li><a href="${ pageName }/html1">跳转到html1</a></li>
</ul>

</body>
</html>