<%@page import="Modele.Panier"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    String nom= (String) session.getAttribute("leNom");
	out.println(nom);
%>

<form action="S2" method="post">
Article : <input type="text" name="article"> <br>
Prix : <input type="text" name="prix"> <br>
<input type="submit" value="Ajouter un produit"><br>
</form>
<form action="S3" method="post">

<input type="submit" value="Selectionner Pizzeria"><br>

</form>

<a href="panier.jsp">Voir panier</a>

</body>
</html>