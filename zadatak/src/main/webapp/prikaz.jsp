<%@page
	import="it.engineering.web.zadatak.repository.ProizvodRepository"%>
<%@page import="it.engineering.web.zadatak.domain.Proizvod"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	heigth:100vh;
}
html {
	height:100vh;
}
div{
	height:100vh;
}
#container {
	display: flex;
	width:100%;
	heigth:100%;
	align-items: center;
	justify-content:center;
	flex-direction: column;
}
#table{
	
}
</style>
</head>
<body>
	<%
	ProizvodRepository ur = new ProizvodRepository();
	List<Proizvod> lista = ur.getAll();
	//out.println(lista);
	request.setAttribute("list", lista);
	%>
	<div id="container">
		<table id="table">
			<thead>
				<tr>
					<th>Sifra</th>
					<th>Naziv</th>
					<th>Cena bez pdv-a</th>
					<th>Jedinica</th>
					<th>Cena sa pdv-om</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="proizvod" items="${list}">
					<tr>
						<th>${proizvod.sifra}</th>
						<th>${proizvod.naziv}</th>
						<th>${proizvod.cenaBez}</th>
						<th>${proizvod.jedinica}</th>
						<th>${proizvod.cenaSa}</th>

						<th><a
							href="/zadatak/application/proizvod-edit?sifra=${proizvod.sifra}">Edit</a></th>
					</tr>
				</c:forEach>
			</tbody>
		</table><br>
		<a href="http://localhost:8080/zadatak/brisanje-po-sifri.jsp">Brisanje
			proizvoda</a>
	</div>
</body>
</html>