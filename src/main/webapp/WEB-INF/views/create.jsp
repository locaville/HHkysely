<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="resources/css/home.css" />" rel="stylesheet" type="text/css">
<%-- <link href="<c:url value="resources/css/reset.css" />" rel="stylesheet" type="text/css"> --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

<h1>Lis&auml;&auml; kysely</h1>
	<form action="" method="POST">
	<table>
		<tr><td>Nimi</td><td><input type="text" name="nimi" placeholder="Kyselyn nimi"/></td></tr>
		<tr><td>Tyyppi</td><td><input type="text" name="tyyppi" placeholder="Koulukysely"/></td></tr>
		<!--
			<tr><td>Tila</td><td><input type="text" name="tila"/></td></tr>
			<tr><td>LuontiPVM</td><td><input type="text" name="luontipvm"/></td></tr>
			<tr><td>AlkamisPVM</td><td><input type="text" name="alkamispvm"/></td></tr>
			<tr><td>P&auml;&auml;ttymisPVM</td><td><input type="text" name="paattymispvm"/></td></tr>
		-->
		<tr><td colspan="2" align="right"><input type="submit" value="Lis&auml;&auml; kysely"/></td></tr>
	</table>
	</form>
	
	
	<!--
	<h2>Lis&auml;&auml; kysymys</h2>
	<form action="" method="POST">
	<table>
		<tr><td>Nimi</td><td><input type="text" name="nimi" placeholder=""/></td></tr>
		<tr><td>Teksti</td><td><input type="text" name="teksti" placeholder=""/></td></tr>
		<tr><td colspan="2" align="right"><input type="submit" value="Lis&auml;&auml; kysymys"/></td></tr>
	</table>
	</form>
	
	<h2>Lis&auml;&auml; vaihtoehto</h2>
	<form action="" method="POST">
	<table>
		<tr><td>Teksti</td><td><input type="text" name="teksti" placeholder=""/></td></tr>
		<tr><td colspan="2" align="right"><input type="submit" value="Lis&auml;&auml; kysymys"/></td></tr>
	</table>
	</form>
	 -->


	

<p><a href="kysymys">Luo Kysymys</a></p>	

<p><a href="/mvc">home</a></p>	



</body>
</html>