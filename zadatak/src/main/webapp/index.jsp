<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style type="text/css">
body {
	margin: 0;
}

.flex-center {
	display: flex;
	justify-content: center;
	align-items: center;
}

.h-cover {
	height: 100vh;
}

.login {
	background-image:
		url("https://www.10wallpaper.com/wallpaper/1366x768/2005/City_Night_Skyscraper_Horizon_2020_HD_Photography_1366x768.jpg");
	background-size: cover;
}

.login-container {
	padding: 1.5rem;
	border: 1px solid #f9e9ff;
	border-radius: 5px;
	-webkit-backdrop-filter: blur(10px) brightness(1.5);
	backdrop-filter: blur(10px) brightness(1.5);
	text-align: center;
	font-size: 1.3rem;
	color: #f9e9ff;
}

.logo {
	margin-bottom: 2rem;
}

.logo h1 {
	margin-bottom: 0;
}

.input {
	margin: 2rem auto;
}

.registration-link {
	margin: 2rem auto 0.5rem;
}

input {
	font-size: 1.3rem;
}

.btn {
	cursor: pointer;
	border: none;
	background-color: #0f0e22;
	color: #f9e9ff;
	padding: 0.5rem;
	transition: 0.1s;
	border-radius: 5px;
	transform: translateY(-3px);
}

.btn:active {
	transform: translateY(0);
}

.btn:hover {
	background-color: #716cc3;
}

.input-floating {
	position: relative;
}

.input-floating input {
	width: 100%;
	border: none;
	outline: none;
	background-color: #f9e9ff;
	border-radius: 5px;
	padding: 1rem 0.5rem;
}

.input-floating input:not(:-moz-placeholder-shown)+label {
	top: 0;
	left: 0.5rem;
	font-size: 0.8rem;
	transform: none;
}

.input-floating input:not(:-ms-input-placeholder)+label {
	top: 0;
	left: 0.5rem;
	font-size: 0.8rem;
	transform: none;
}

.input-floating input:focus+label, .input-floating input:not(:placeholder-shown)+label
	{
	top: 0;
	left: 0.5rem;
	font-size: 0.8rem;
	transform: none;
}

.input-floating input.invalid {
	border: 2px solid red;
}

.input-floating input.invalid+label {
	color: red;
}

.input-floating label {
	color: #0f0e22;
	position: absolute;
	top: 50%;
	transform: translateY(-50%);
	left: 0.5rem;
	transition: 0.2s;
}
</style>
</head>
<body class="flex-center h-cover login">
	<form action="/zadatak/application/home" method="post">
	<div class="login-container">
		<div class="logo">
			<h1>Company</h1>
			<small>HELLO WORLD</small>
		</div>
		<p>${error}</p>
		<div class="input input-floating">
			<input type="text" name="username" id="username" placeholder=" ">
			<label for="username" class="floating-label">Username</label>
		</div>
		<div class="input input-floating">
			<input type="password" name="password" id="password" placeholder=" ">
			<label for="password" class="floating-label">Password</label>
		</div>
		<div class="input">
			<input type="submit" value="Login" class="btn" id="login">
		</div>
		<div class="registration-link">
			Don't have an account? You can register <a href="#">here</a>
		</div>
	</div>
	</form>
	<script src="scripts/script.js"></script>
</body>
</html>