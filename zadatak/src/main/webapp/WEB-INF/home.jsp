<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/login.jsp" flush="true"/>
<div>
	<a href="http://localhost:8080/zadatak/prikaz.jsp">Prikazi sve proizvode</a>
	<a href="http://localhost:8080/zadatak/unesi-novi.jsp">Unesi novi proizvod</a>
	<a href="http://localhost:8080/zadatak/brisanje-po-sifri.jsp">Brisanje proizvoda</a>
</div>
</body>
</html>