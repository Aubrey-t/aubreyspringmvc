<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Manager</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
	<link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container">
		<div class="row">
			
				<div class="form-group">
					<label for="project-name">Name</label>
					<span>${project.name}</span>
				</div>

				<div class="form-group">
					<label for="project_type">Type</label>
					<span>${project.type }</span>
                    <input id="project_type" type="text" class="form-control" name="type"/>
				</div>
							
				<div class="form-group">
					<label for="sponsor">Sponsor</label>
					<span>${project.sponsor}</span>
                    <input id="sponsor" type="text" class="form-control" name="sponsor"/>
				</div>
			
				<div class="form-group">
					<label for="funds">Authorized Funds</label>
					<span>${project.authorizedFunds}</span>
                    <input id="authorizedFunds" type="text" class="form-control" name="authorizedFunds"/>
				</div>
			
				<div class="form-group" >
					<label for="hours">Authorized Hours</label>
					<span>${project.authorizedHours}</span>
                    <input id="authorizedHours" type="text" class="form-control" name="authorizedHours"/>
				</div>
			
				<div class="form-group">
					<label for="project-name">Description</label>
					<span>${project.description}</span>
                    <input id="project-name" type="text" class="form-control" name="description"/>
				</div>
				
				<div class="form-group">
					<label for="special">Special</label>
					<span>${project.special == true ? 'Yes':'No'}</span>
                    <input id="special" type="text" class="form-control" name="special"/>
				</div>
			
		</div>
	</div>
</body>
</html>