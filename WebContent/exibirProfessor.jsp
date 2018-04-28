<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="model.Professor"%>
<%@ page import="model.Disciplina"%>


<%
	Professor professor = (Professor)request.getAttribute("professor");
	ArrayList<Disciplina> disciplinas = (ArrayList<Disciplina>) request.getAttribute("disciplinas");
	String titulacao = null;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
switch(professor.getTitulacao()){
case 1:
	titulacao = "especialização";
	break;
case 2:
	titulacao = "mestrado";
	break;
case 3:
	titulacao = "doutorado";
	break;
}
%>


	<h1>
		Professor:
		<%= professor.getNome() %></h1>
	<br />
	<h1>
		Nome da mãe:
		<%= professor.getNomemae() %></h1>
	<br />
	<h1>
		Titulação:
		<%= titulacao %></h1>
	<br />
	<h1>Disciplinas:</h1>
	<br />
	<table>
		<% for(int i =0; i < disciplinas.size(); i++){
	%><tr>
			Nome:
			<%= disciplinas.get(i).getNome() %>
			| Curso:
			<%= disciplinas.get(i).getCurso() %>
			| Carga horária:
			<%= disciplinas.get(i).getCargahoraria() %>
		</tr>
		<br />
		<%
}
%>




	</table>
</body>
</html>