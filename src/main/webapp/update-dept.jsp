<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	 <h1>Update departements</h1>
    <form action="UpdateDepartementServlet" method="post">
    <input type="hidden" id="id" name="id" value="${param.id}">
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