<%@page import="it.engineering.web.zadatak.repository.ProizvodRepository"%>
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
</head>
<body>
<% ProizvodRepository ur=new ProizvodRepository();
	List<Proizvod> lista=ur.getAll();
	//out.println(lista);
	request.setAttribute("list", lista);
%>
<table>
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
							</tr>
						</c:forEach>
					</tbody>
				</table>
</body>
</html>