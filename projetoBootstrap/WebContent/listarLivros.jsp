<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de livros</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<table>
		<c:forEach items="${ requestScope.listaLivro}" var="livro">
			<tr>
				<td><c:out value="${livro.titulo}"></c:out></td>
				<td><c:out value="${livro.autor}"></c:out></td>
				<td><c:out value="${livro.descriao}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>