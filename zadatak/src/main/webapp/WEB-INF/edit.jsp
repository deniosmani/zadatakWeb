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
	<form method="post" action="/zadatak/application/proizvod-save">
		<label>Sifra</label> <input type="text" name="sifra"
			value="${proizvod.sifra}" readonly="readonly" /><br> <label>Naziv</label>
		<input type="text" name="naziv" value="${proizvod.naziv}" /><br>
		<label>Cena bez pdv-a</label>
		<input type="text" name="cenaBez" value="${proizvod.cenaBez}" /><br>
		<label>Jedinica</label>
		<input type="text" name="jedinica" value="${proizvod.jedinica}" /><br>
		<div>
			<input type="submit" name="button" value="Save">
		</div>

		

	</form>
</body>
</html>