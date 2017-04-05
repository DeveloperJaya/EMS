<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script></script>
<style>
body{
margin:0 0;
width:100%;
overflow:scroll;
background-color:#dbd2ac;
}
#header{
margin:0 0 0 0;
width:auto;
height:100px;
background-color:#dbd2ac;
}
#footer{
margin:0 0 0 0;
width:auto;
height:300px;
background-color:#dbd2ac;
border:0px solid #000000;
}
#main{
margin:0 auto;
width:auto;
height:200px;
border:0px solid #000000;
background-color:#9da347;
}
#loginform{
width:300px;
margin:0 auto;
background-color:#9da347;
border:0px solid #000000;
}
pre{
margin-top:5px;
margin-bottom:1px;
}
pre#bold{
font-weight:bold;
}
.txtbox{
background-color:#ffffff;
}
#submit{
margin-top:0px;
margin-left:-14px;
}
h1,h3{
padding-top:30px;
}
</style>
</head>
<body>
<div id="header" align="center"><h1>Employee Management Portal</h1></div>
<div id="main" align="center">
<div id="loginform" align="center">
<h3>Administrative Login</h3>
<form action="/EmployeeManagementSystem/test/submitLogin.html" method="POST">
<pre id="bold">

User Name:<input class="txtbox" type="text" name="uName">

Password :<input class="txtbox" type="password" name="uPass">

<input id="submit" type="submit" name="login" value="Login">

</pre>
</form>
</div>
</div>
<div id="footer" align="center">@Copyright 2017 by Jayashree Das</div>
</body>
</html>