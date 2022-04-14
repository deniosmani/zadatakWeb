<%@page import="it.engineering.web.zadatak.repository.ProizvodRepository"%>
<%@page import="it.engineering.web.zadatak.domain.Proizvod"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ProizvodRepository ur=new ProizvodRepository();
	List<Proizvod> lista=ur.getAll();
	out.println(lista);
%>
</body>
</html>