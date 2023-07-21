<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chercher un departement</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

body::before {
	content: '';
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background-image: url('asset/France_départementale.png');
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	opacity: 0.1;
	z-index: -1;
}

h1 {
	color: #007BFF;
	text-align: center;
	padding-top: 30px;
}

form {
	max-width: 400px;
	margin: 20px auto;
	padding: 20px;
	background-color: #fff;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

label {
	display: block;
	margin-top: 0px;
	margin-bottom: 10px;
	font-weight: bold;
	margin-bottom: 10px;
}

input[type="text"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
	box-sizing: border-box;
}

input[type="submit"] {
	display: block;
	width: 100%;
	margin-top: 20px;
	padding: 10px;
	background-color: #007BFF;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<h1>Entrez votre département</h1>
	<form action="ShowDept" method="POST">
		<label for="departement">Département :</label> 
		<input type="text" id="departement" name="departement"> <br> 
		<input type="submit" value="Envoyer">
	</form>
	<a href="save-dept.jsp">Texte ou contenu du lien</a>
	<a href="FindallDepartementServlet">Texte ou contenu du lien</a>

</body>
</html>