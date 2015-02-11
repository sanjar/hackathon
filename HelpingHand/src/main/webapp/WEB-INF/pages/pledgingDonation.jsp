<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
<title>mbrdi</title>

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
       
    <div id="">           
  <header style="padding-bottom: 50px;padding-top: 60px"> 
  
        <span class="brandname" id="m_ex" style="font-size: 30px"><span style="color:#fff">M</span>BRDI <span style="color:#fff; margin-left:20px;">C</span>ORPORATE<span style="color:#fff; margin-left:20px;"> S</span>OCIAL <span style="color:#fff;margin-left:20px;">R</span>ESPONSIBILITY</span>
        <span class="brandname" id="m_ex1"></span>
        <span class="brandname"><img src="<c:url value='/resources/images/helping_hand_logo.png' />"/></span>
       
      
     </header>   
<div style="padding-top:40px" class="" data-wow-duration="">
                   <div class="example-one12" style="text-align:center"><b>Pledge a donation
to PM relief fund
</b></div>
                   
    </div> <!-- ITEM END -->
 
    <div id="services" class="container">
<div class="row">
     <c:forEach var="pledgingDonation" items="${pledgingTypeDonationList}" varStatus="count">
               <a href="submit?type=PLEDGING_DONATION&amount=${pledgingDonation.amount}&name=${pledgingDonation.name}" style="text-decoration:none"><div style="padding-top:100px" class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="">
                 <div class="example-one${count.index+1}" style="line-height:30px;padding-top: 20px">
                  <b>INR ${pledgingDonation.amount}</b><br/>
                  <b>${pledgingDonation.name}</b>
                 </div>
                  </a>
       </div> </c:forEach><!-- ITEM END -->

                

               
      </div>
<form name="customAmount" method="POST" action="customSubmit">
  <label style="padding-right:40px" for="CustomAmount"><b>Custom Amount</b></label>
  <input style="padding-right:120px" type="text" name="customAmount" id="customAmount">
  <input  type="submit" name="submit" id="submit" value="Submit">
</form>
    </div>
    
   
   
</body>
</html>