<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 	<%@page import="it.engineering.web.zadatak.constant.WebConstant"%>
 	<%@page import="it.engineering.web.zadatak.domain.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-image: url("https://www.ppt-backgrounds.net/thumbs/white-and-light-purple-download-downloads-backgrounds.jpg");
	margin: 0;
	background-repeat: no-repeat;
    background-size: 100% 100%;
	heigth: 100vh;
}
html {
	height:100vh;
}
div{
	heigth: 100vh;
}

#container {
	display: flex;
	width: 100%;
	heigth: 100vh;
	align-items: center;
	justify-content:center;
	flex-direction: column;
}
</style>
</head>
<body>
<% HttpSession session1 = request.getSession();
	User user=(User)session1.getAttribute("loginUser");
	System.out.println(user);
	if(user==null){
		request.getRequestDispatcher(WebConstant.PAGE_INDEX).forward(request, response);
	}
%>
<jsp:include page="/login.jsp" flush="true"/>

<div id="container">
	<a href="http://localhost:8080/zadatak/prikaz.jsp">Prikazi sve proizvode</a>
	<a href="http://localhost:8080/zadatak/unesi-novi.jsp">Unesi novi proizvod</a>
	<a href="http://localhost:8080/zadatak/brisanje-po-sifri.jsp">Brisanje proizvoda</a>
</div>
</body>
</html>