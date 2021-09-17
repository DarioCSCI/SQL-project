<%-- 
    Document   : editProfile
    Created on : Apr 16, 2021, 2:20:37 PM
    Author     : jacobhall
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
         <h1>Edit Profile</h1>
        <!--Connect to the LoginServlet-->
        <form action="EditProfileServlet" method="post">
            <!--Item Name input-->
            <div id="uname">First Name:</div>
            <input type="text", name="uname" /><br/><br>
             <!--Item Name input-->
            <div id="uname">Last Name:</div>
            <input type="text", name="uname" /><br/><br>  
            <!--Model Number input-->
             <div id="upwd">Phone:</div>                                    
            <input type="text", name="phone" /><br/><br>
            <div id="uname">Street:</div>
            <input type="text", name="street" /><br/><br>
             <!--Item Name input-->
            <div id="uname">City:</div>
            <input type="text", name="city" /><br/><br>    
            <!--Model Number input-->
             <div id="upwd">Zipcode:</div>                                    
            <input type="text", name="zipcode" /><br/><br>
            <div id="uname">Country:</div>
            <input type="text", name="country" /><br/><br>  
            <!--Submit input-->
            <input type="submit", value="Submit" id="submit" />
            <input type="reset">
        </form>
    </body>
</html>
