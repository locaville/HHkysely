<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="resources/css/home.css" />" rel="stylesheet" type="text/css">
<title>Valmis kysely</title>
</head>
<body>

<h1>Valmis kysely</h1>

<table>
		<caption>Kyselyn kysymykset</caption>
			<thead>
				<tr>
					<td>ID</td>
					<td>Nimi</td>
					<td>Tyyppi</td>
					<td>Tila</td>
					<td>+/-</td>
				</tr>
			</thead>
			<tbody>
<%-- 				<c:forEach items="${kysely}" var="kysely"> --%>
					<tr>
						<td><c:out value="${kysely.id}" /></td>
						<td><c:out value="${kysely.nimi}" /></td>
						<td><c:out value="${kysely.tyyppi}" /></td>
						<td><c:out value="${kysely.tila}" /></td>
					</tr>
<%-- 				</c:forEach> --%>
			</tbody>

		<tfoot>
			

			
		</tfoot>
		</table>


 


<p><a href="create">Luo kysely</a></p>

<!-- <p><a href="kysymys">Luo kysymys</a></p>	 -->

</body>
</html>