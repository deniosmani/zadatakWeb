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
	height:100vh;
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
<div id="container">
<form action="/zadatak/application/add-proizvod" method="post">
		
			
			sifra:
			
				<input type="text" name="sifra" >
		
			<br>
			naziv:
			
				<input type="text" name="naziv" >
			<br>
			cena bez pdv-a:
			
				<input type="text" name="cenaBez" >
			<br>
			jedinica:
			
				<input type="text" name="jedinica" >
			<br>
			
			
				<input type="submit" name="save" value="Sacuvaj">
			
		</form>
</div>
</body>
</html>