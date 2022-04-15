<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
}
#container {
	display: flex;
	width:100%;
	heigth:100vh;
	align-items: center;
	justify-content:center;
	flex-direction: column;
}
</style>
</head>
<body>
<jsp:include page="/login.jsp" flush="true"/>
<div id="container">
	<a href="http://localhost:8080/zadatak/prikaz.jsp">Prikazi sve proizvode</a>
	<a href="http://localhost:8080/zadatak/unesi-novi.jsp">Unesi novi proizvod</a>
	<a href="http://localhost:8080/zadatak/brisanje-po-sifri.jsp">Brisanje proizvoda</a>
</div>
</body>
</html>