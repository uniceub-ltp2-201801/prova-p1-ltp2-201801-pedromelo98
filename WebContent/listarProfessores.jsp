<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="model.Professor"%>

<%
	ArrayList<Professor> professores = (ArrayList<Professor>) request.getAttribute("professores");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar professores</title>
</head>
<body>
<table>
	<%
		for (int i = 0; i < professores.size(); i++) {

			%>
			<tr><a href="ExibirProfessor?id=<%= professores.get(i).getIdprofessor() %>&nomeprofessor=<%= professores.get(i).getNome() %>&datanasc=<%= professores.get(i).getDatanasc() %>&titulacao=<%= professores.get(i).getTitulacao() %>&nomemae=<%= professores.get(i).getNomemae() %> " > <%= professores.get(i).getNome() %> </a></tr><br/>
			<%
			
		}
	%>
</table>
</body>
</html>