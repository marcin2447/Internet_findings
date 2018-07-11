<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"     %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Internet findings</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="resources/css/styles.css" type="text/css" rel="stylesheet">
  </head>

  <body>
    
    <nav class = "navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <a href="" class="navbar-brand">Internet findings</a>
        
        <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
          <span class="glyphicon glyphicon-list"></span>
        </button>
        
        <div class="collapse navbar-collapse navHeaderCollapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="">Główna</a></li>
            <li><a href="add">Dodaj</a></li>
            <li><a href="login">Zaloguj się</a></li>
          </ul>
        </div>
        
      </div>
    </nav>
   
 


<c:forEach var="discovery" items="${allDiscoveries}">
<div class="container">
		      <div class="row bs-callout bs-callout-primary">
		      	
		        <div class="col col-md-11 col-sm-10">
		          <h3 class="centered"><a href="<c:out value="${discovery.url}" />"><c:out value="${discovery.name}" /></a></h3>
		        
		          <p><c:out value="${discovery.description}" /></p>
		          <a href="<c:out value="${discovery.url}" />" class="btn btn-default btn-xs">Przejdź do strony</a>
		        </div>
		      </div>
		    </div>
		   
</c:forEach>




     
     
    
    <footer class="footer">
      <div class="container">
        <p class="navbar-text">Internet findings - developed by <a href="">Marcin</a></p>
      </div>
    </footer>
    
    <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script src="resources/js/bootstrap.js"></script>
  </body>
</html>