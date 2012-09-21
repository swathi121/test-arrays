<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<link href="/login.css" rel="stylesheet" type="text/css"/>

<body>

<div id="main">
		<div id="ad" style="width:100%;height:20%;" >
	   		<iframe
		      src="header.jsp"
		      border="0"
		      scrolling="no"
		      allowtransparency="true"
		      width="100%"
		      height="100%"
		      style="border:0;">
	    	</iframe>
		</div>
	<div id="container" style="width:100%;height:60%;">
		<%out.println("<h1><center>welcome to the application</h1>");%>
	</div>
	<div id="ad" style="width:100%;height:20%;" >
	   <iframe
	      src="footer.jsp"
	      border="0"
	      scrolling="no"
	      allowtransparency="true"
	      width="100%"
	      height="100%"
	      style="border:0;">
	   </iframe>
	</div>

</div>
</body>
</html>

