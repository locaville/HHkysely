<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="resources/css/home.css" />" rel="stylesheet" type="text/css">
<title>Luo kysymys</title>
</head>
<body>

<h1>new Kysymys</h1>

<form:form method="POST" commandName="kysymys" action="valmisKysymys" class="box login">
	<fieldset class="boxBody">
	  <form:label path="teksti">Kysymyksen teksti</form:label>
	  <form:input onfocus="true" size="150" path="teksti" placeholder="teksti"></form:input>
	  <br>
	  <form:label path="tyyppiid">Kysymyksen tyyppi</form:label>
	  <form:input path="tyyppiid" placeholder="tyyppiid"></form:input>
	 
	
<%--     <form:radiobutton path="tyyppiid" value="Teksti" />Teksti --%>
<%--     <form:radiobutton path="tyyppiid" value="Monivalinta" />Monivalinta --%>
<%--     <form:radiobutton path="tyyppiid" value="RadioButton" />Radio Button --%>
	

<%--     <form:select path="tyyppiid"> Tyyppi --%>
<%--     <form:option value=""> --SELECT--</form:option> --%>
<%--     <form:options items="${kysymys.tyyppiid}"></form:options> --%>
<%--   	</form:select> --%>
	  
	 </fieldset>
	
	<footer>
<%-- <form:form id="tyyppiid" method="POST" commandName="kysymys" action="valmisKysymys"> --%>
<%--     <form:radiobutton path="env" value="Teksti" />Teksti --%>
<%--     <form:radiobutton path="env" value="Monivalinta" />Monivalinta --%>
<%--     <form:radiobutton path="env" value="RadioButton" />Radio Button --%>
<%-- </form:form> --%>
	 
	
	<!-- en oikein tiedä vielä miten radiobuttons laitetaan tässä -->
<%-- 	  <form:radiobuttons  path="tyyppiid"/> --%>
<%-- 	  <form:label path="tyyppiid">Tyyppiid</form:label> --%>

	  <input type="submit" class="btnLogin" value="Luo" tabindex="4">
	</footer>
</form:form>



<p><a href="create">create</a></p>	

<p><a href="/mvc">home</a></p>	

</body>
</html>