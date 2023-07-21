<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h1>Ajouter un département</h1>
    <form action="SaveDepartementServlet" method="post">
        <label for="deptNum">Numéro de département:</label>
        <input type="text" id="deptNum" name="deptNum" required>
        <br>
        <label for="deptName">Nom du département:</label>
        <input type="text" id="deptName" name="deptName" required>
        <br>
        <input type="submit" value="Enregistrer">
    </form>
</body>
</html>