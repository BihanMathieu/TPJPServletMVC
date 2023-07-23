<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des départements</title>
</head>
<body>
    <h1>Liste des départements</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>DeptNum</th>
            <th>DeptName</th>
            <th>Actions</th>
        </tr>
        <% for (modele.Departement departement : (java.util.List<modele.Departement>) request.getAttribute("departements")) { %>
            <tr>
                <td><%= departement.getId() %></td>
                <td><%= departement.getDeptNum() %></td>
                <td><%= departement.getDeptName() %></td>
                <td>
                    <a href="update-dept.jsp?id=<%= departement.getId() %>">Update</a>
                    <a href="DeleteDepartementServlet?id=<%= departement.getId() %>">Supprimer</a>
                </td>
            </tr>
        <% } %>
    </table>
</body>
</html>