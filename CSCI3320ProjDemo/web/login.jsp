<%-- 
    Document   : login2
    Created on : Apr 17, 2021, 10:14:54 PM
    Author     : jacobhall
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CSCI 3320: Login Page</title>
    </head>
    <body>
        <h1>Account Login</h1>
        <!--Connect to the LoginServlet-->
        <form action="LoginServlet" method="post">
            <!--Username input-->
            <div id="uname">Username:</div>
            <input type="text", name="uname" /><br/>  <br>   
            <!--Password input-->
             <div id="upwd">Password:</div>                                    
             <input type="password", name="upwd" /><br/><br>
            <!--Submit input-->
            <input type="submit", value="Submit" id="submit" /><br/><br>
        </form>
    </body>
</html>
