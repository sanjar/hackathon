<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
<title>mbrdi</title>

    <link rel="StyleSheet"
	href="<c:url value='/resources/css/bootstrap.min.css' />"
	type="text/css" />
<link rel="StyleSheet" href="<c:url value='/resources/css/style.css' />"
	type="text/css" />
<link rel="StyleSheet"
	href="<c:url value='/resources/css/responsive.css' />" type="text/css" />
<script type="text/javascript"
	src="<c:url value='/resources/js/drifolio.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/resources/js/jquery.easing.min.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/resources/js/jquery.jribbble-1.0.1.ugly.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/resources/js/jquery.nicescroll.min.js'/>"></script>
<script type="text/javascript"
	src="<c:url value='/resources/js/wow.min.js'/>"></script>
  </head>
    <body data-spy="scroll">
                 
  <header style="padding-bottom: 50px;padding-top: 60px"> 
  
        <span class="brandname" id="m_ex" style="font-size: 30px"><span style="color:#fff">M</span>BRDI <span style="color:#fff; margin-left:20px;">C</span>ORPORATE<span style="color:#fff; margin-left:20px;"> S</span>OCIAL <span style="color:#fff;margin-left:20px;">R</span>ESPONSIBILITY</span>
        <span class="brandname" id="m_ex1"></span>
        <span class="brandname" style="float: inherit;"><img src="<c:url value='/resources/images/helping_hand_logo.png' />"/></span>
       
      
     </header>
     
     <div id="services" class="container">
      
<div style="padding-left:100px;padding-top:50px" class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
                   <div style="padding-top:20px" class="example-one11" style="text-align:center"><strong> Thanks for your support</strong></div>
                   
                   
                   
                   
    </div>

<!-- ITEM END -->
    
   
    
    
    
    
 </div>
 
  <div style="padding-left:390px" class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
                    <a href="submit?type=WISH&amount=${wishDonation.amount}&name=${wishDonation.name}" style="text-decoration:none"><div class="example-one9" style="text-align:center"><b>Download A Receipt</b></div></a>
                   
                   
    </div> <!-- ITEM END --></div>
    
 
</body>
</html>