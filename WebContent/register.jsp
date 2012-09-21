<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>login page</title>
	<link href="/AppIntegrate/login.css" rel="stylesheet" type="text/css"/>
	
	<script type="text/javascript">
	function checkData()
{
	var nm=document.form1.user.value		
	var key=document.form1.key.value
	var key=document.form1.email.value
	if(nm=="" || key=="")
	{
		if(nm=="")
		{
			alert("Name should not left blank")
			document.form1.user.value=""
			document.form1.user.focus()
			return false
		}

		if(key=="")
		{
			alert("Enter Password")
			document.form1.key.value=""
			document.form1.key.focus()
			return false
		}	
		if(email==""){
			alert("Enter email");
			document.form1.email.value="";
			document.form1.email.focus();
			return false;
		}		

	}
	else
	{
		return true
		
	}
}
</script>

</head>
<body bgcolor="white">

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
		<form name="form1" method="post" action="/AppIntegrate/register" onSubmit="return checkData()">
		<table align="center" width="350" hight="400">
			<tr>
				<th colspan=5><h2>Login Page</h2></th>
			</tr>
			<tr>
				<td width="120">Username:</td>
				<td><input type="text" name="user" size="20" maxlength="50"/></td>
			</tr>
			<tr>
				<td width="120">Password:</td>
				<td><input type="password" name="key" size="20" maxlength="50"/></td>
			</tr>
			<tr>
				<td width="120">Email Id:</td>
				<td><input type="text" name="email" size="20" maxlength="50"/></td>
				<td width="120">ex:name@gmail.com</td>
			</tr>
			<tr>
				<td><input type="submit" size="30" name="submit" value="submit"/></td>
				
				<td><a href="register.jsp" onmouseOver="white">Rgister</a></td>
 		    </tr>
 		</table>
	</form>
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