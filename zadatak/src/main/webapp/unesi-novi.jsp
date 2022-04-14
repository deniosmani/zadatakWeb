<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/zadatak/application/add-proizvod" method="post">
		
			
			sifra:
			<div>
				<input type="text" name="sifra" >
			</div>
			
			naziv:
			<div>
				<input type="text" name="naziv" >
			</div>
			cena bez pdv-a:
			<div>
				<input type="text" name="cenaBez" >
			</div>
			jedinica:
			<div>
				<input type="text" name="jedinica" >
			</div>
			
			<div>
				<input type="submit" name="save" value="Sacuvaj">
			</div>
		</form>
</body>
</html>