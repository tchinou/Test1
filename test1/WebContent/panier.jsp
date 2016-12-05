<%@page import="services.ComposantPanier"%>
<%@page import="services.GestionPanier"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="Modele.*"  %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String nom = (String)session.getAttribute("leNom");
	out.println(nom);
	%>

<br><br><br>

Liste des articles
<table border=2>
<tr><td>Article</td><td>Prix</td></tr>
<%   ComposantPanier cp=(ComposantPanier) session.getAttribute("service");
	Panier panier=cp.findAll();
	for (Produit p : panier.getPanier()){
	out.println("<tr><td>" +(String)p.getNom()+"</td><td>"+p.getPrix()+"</td></tr>");
}	
	%>	
</table>

<form action="ajout.jsp">
<input type="submit" value="Ajouter">
</form>

<a href="fin.jsp">fin</a>



</body>
</html>