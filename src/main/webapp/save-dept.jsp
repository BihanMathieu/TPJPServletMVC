<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <h1>Ajouter un d�partement</h1>
    <form action="SaveDepartementServlet" method="post">
        <label for="deptNum">Num�ro de d�partement:</label>
        <input type="text" id="deptNum" name="deptNum" required>
        <br>
        <label for="deptName">Nom du d�partement:</label>
        <input type="text" id="deptName" name="deptName" required>
        <br>
        <input type="submit" value="Enregistrer">
    </form>
</body>
</html>