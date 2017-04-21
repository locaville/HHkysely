<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="resources/css/home.css" />" rel="stylesheet" type="text/css">
<title>Valmis kysymys</title>
</head>
<body>

<h1>Valmis kysymys</h1>

<p>Kysymyksen teksti on: ${kysymys.teksti}</p>
<p>Kysymyksen tyyppi on: ${kysymys.tyyppiid}</p>
<!-- Pitää miettiä vielä miten kysymykseen lisätään ID ja KyselyID -->
 
 
 <form:form method="POST" commandName="kysely" action="valmisKysely" class="homeButton3">
<input type="submit" class="btnLogin" tabindex="4"  value="Luettelo">

</form:form>

<!-- <p><a href="valmisKysely">Valmis Kysely</a></p> -->
<br> 
<br>
<p> </p>

<p><a href="create">create</a></p>	

<p><a href="/mvc">home</a></p>	

</body>
</html>