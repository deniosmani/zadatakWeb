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
	heigth: 100vh;
}
html {
	height:100vh;
}
div{
	height:100vh;
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
	<div id="container">
	<form method="post" action="/zadatak/application/proizvod-save">
		<label>Sifra</label> <input type="text" name="sifra"
			value="${proizvod.sifra}" readonly="readonly" /><br> <label>Naziv</label>
		<input type="text" name="naziv" value="${proizvod.naziv}" /><br>
		<label>Cena bez pdv-a</label>
		<input type="text" name="cenaBez" value="${proizvod.cenaBez}" /><br>
		<label>Jedinica</label>
		<input type="text" name="jedinica" value="${proizvod.jedinica}" /><br>
		
			<input type="submit" name="button" value="Save">
		</div>

		

	</form>
</body>
</html>