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
<!-- <link href="SpryAssets/SpryValidationTextField.css" rel="stylesheet" type="text/css">
   <script src="SpryAssets/SpryValidationTextField.js" type="text/javascript"></script> -->
  </head>
    <body data-spy="scroll">
                 
  <header style="padding-bottom: 50px;padding-top: 60px"> 
  
        <span class="brandname" id="m_ex" style="font-size: 30px"><span style="color:#fff">M</span>BRDI <span style="color:#fff; margin-left:20px;">C</span>ORPORATE<span style="color:#fff; margin-left:20px;"> S</span>OCIAL <span style="color:#fff;margin-left:20px;">R</span>ESPONSIBILITY</span>
        <span class="brandname" id="m_ex1"></span>
        <span class="brandname" style="float: inherit;"><img src="<c:url value='/resources/images/helping_hand_logo.png' />"/></span>
       
      
     </header>
     
     <div id="services" class="container">
     <div class="row">  
<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
                   <div class="example-one8" style="text-align:center"><b> Fullfil a Wish</b></div>
                   
                   
                   
                   
    </div>

<!-- ITEM END -->
    
    <div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
                    <div class="example-one9" style="text-align:center"><b> INR ${amount} ${wishName}</b></div>
                   
                   
    </div> <!-- ITEM END --></div>
    
    
    
    
    <div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
    <div class="h3" style="text-align:center">Who is Who Details:</div>
<div><span id="sprytextfield1">
<label for="UserName">User Name</label>
<input type="text" name="UserName" id="UserName">
</span>
<form name="donationForm" method="POST" action="submit">

 <!-- <script type="text/javascript">
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield1");
 </script> -->
 

 
    <div>
<span id="sprytextfield2">
<label for="password" style="padding-right:7px"> Password </label>
<input type="text" name="password" id="password">
</span>

<!-- <script type="text/javascript">
var sprytextfield1 = new Spry.Widget.ValidationTextField("sprytextfield2");
 </script> -->
 <div style="padding:15px 0px 0px 50px" >
 <input type="submit" name="submit" id="submit" value="Submit">
  </div>
   
    </div>
 </form> 
  </div>
 
  <div class="row" data-wow-duration="3s">
  
  
  </div>
 
 </div>
    <div style="float:left;padding-top:25px;padding-left:35px" >
      <table width="307" height="147" border="1">
      
        
          <tr>
            <th width="275" bgcolor="#999999" scope="col">Stats</th>
            <th width="358" bgcolor="#999999" scope="col">Details</th>
          </tr>
          <tr>
            <th bgcolor="#9999FF" scope="row">Name Of NGO</th>
            <td>${selectedOrganization.name }</td>
          </tr>
          <tr>
            <th bgcolor="#9999FF" scope="row">Wish Description</th>
            <td>${wishDetails}</td>
          </tr>
          <tr>
            <th height="34" bgcolor="#9999FF" scope="row">About</th>
            <td>${selectedOrganization.about}</td>
          </tr>
        </table>
     
      
    </div>
 </div>
 
 
 
</body>
</html>