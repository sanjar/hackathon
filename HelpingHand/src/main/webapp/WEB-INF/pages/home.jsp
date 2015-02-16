<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
<title>mbrdi</title>

    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"> -->
    
<link rel="StyleSheet" href="<c:url value='/resources/css/bootstrap.min.css' />" type="text/css" />
<link rel="StyleSheet" href="<c:url value='/resources/css/style.css' />" type="text/css" />
<link rel="StyleSheet" href="<c:url value='/resources/css/responsive.css' />" type="text/css" />
<script type="text/javascript" src="<c:url value='/resources/js/drifolio.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/resources/js/jquery.easing.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/resources/js/jquery.jribbble-1.0.1.ugly.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/resources/js/jquery.nicescroll.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/resources/js/wow.min.js'/>" ></script>
   </head>
    <body data-spy="scroll">
                 
  <header style="padding-bottom: 50px;padding-top: 60px"> 
  
        <div style="text-align:center"><span class="brandname" id="m_ex" style="font-size: 30px"><span style="color:#fff">M</span>BRDI <span style="color:#fff; margin-left:20px;">C</span>ORPORATE<span style="color:#fff; margin-left:20px;"> S</span>OCIAL <span style="color:#fff;margin-left:20px;">R</span>ESPONSIBILITY</span>
        <span class="brandname" id="m_ex1"></span>
        <span class="brandname"><img src="<c:url value='/resources/images/helping_hand_logo.png' />"/></span></div>
       
      
     </header>   

 
    <div id="services" class="container">
<div class="row">
<c:forEach var="event" items="${eventList}" varStatus="count">
              <a href="donation?type=${event.eventType}" style="text-decoration:none"> <div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
                 <div class="example-one${count.index+1}">
                  <b>${event.eventName}</b>
                 </div>
                  
       </div></a> <!-- ITEM END -->
       
   </c:forEach>

               
      </div>
    </div>
    
   
   
</body>
</html>