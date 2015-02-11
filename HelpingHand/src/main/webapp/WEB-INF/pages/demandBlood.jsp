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
					 
	  <header style="padding-bottom: 50px;padding-top: 60px"> 
  
        <span class="brandname" id="m_ex" style="font-size: 30px"><span style="color:#fff">M</span>BRDI <span style="color:#fff; margin-left:20px;">C</span>ORPORATE<span style="color:#fff; margin-left:20px;"> S</span>OCIAL <span style="color:#fff;margin-left:20px;">R</span>ESPONSIBILITY</span>
        <span class="brandname" id="m_ex1"></span>
        <span class="brandname"><img src="<c:url value='/resources/images/helping_hand_logo.png' />"/></span>
       
      
     </header>  
		 
		 <div id="services" class="container">
		 <div class="row">  
	<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
				   <div class="example-one13" style="text-align:center">
						 <h2><b>Request For Blood
						 </b></h2>
	  </div>
					   
					   
					   
					   
		</div>
	
	<!-- ITEM END -->
		
		<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
						
					   
					   
		</div> <!-- ITEM END --></div>
		
		
		
		
		<div class="col-md-6 col-lg-4 wow fadeInUp" data-wow-duration="3s">
	<span style="display: ${requestSuccess};color:green"><b>Request Successfully Updated</b></span>	
	<form:form name="needBlood" method="post" action="needBlood">
	<div class="example-one15" style="text-align:center">
	  
	    <div align="center">
	      <table width="376" border="0">
            <tr>
              <td><div align="left">Needed Blood Group</div></td>
              <td><form:input style=""  type="text" name="UserName2" id="UserName2" path="bloodGroupRequested"/></td>
            </tr>
            <tr>
              <td><div align="left">Contact Person </div></td>
              <td><form:input style=""  type="text" name="UserName22" id="UserName22" path="contactName"/></td>
            </tr>
            <tr>
              <td><div align="left">User Name </div></td>
              <td><form:input style=""  type="text" name="UserName23" id="UserName23" path="userName"/></td>
            </tr>
            <tr>
              <td><div align="left">Description of need </div></td>
              <td><form:input style=""  type="text" name="UserName24" id="UserName24" path="reasonForRequest"/></td>
            </tr>
            <tr>
              <td><div align="left">Contact No. (m) </div></td>
              <td><form:input style=""  type="text" name="UserName25" id="UserName25" path="contactNumber"/></td>
            </tr>
                </table>
        </div>
	 
	 </div>
		<div>
	
	
	
	 <!--div style="padding:15px 0px 0px 300px" >-->
	 <div class="example-one15" style="text-align:center">
	 <input class="example-one14" type="submit" style="text-align:top;line-height:10px" name="submit" id="submit" value="Submit">
	  </div>
	   
		</div>
	 
	  </form:form> 
	  <div class="row" data-wow-duration="3s">
	  
	  
	  </div>
	 
	 </div>
		
	 </div>
	 
	 
	 
	</body>
	</html>