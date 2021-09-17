<%-- 
    Document   : postItem
    Created on : Apr 16, 2021, 2:12:05 PM
    Author     : jacobhall
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post Item</title>
    </head>
    <body>
        <h1>Post Item</h1>
        <!--Connect to the PostItemServlet-->
        <form action="PostItemServlet" method="post">
            <!--Item Name input-->
            <label>Item Type:</label><br><br>
            <input type="radio" id="itemType" name="itemType" value="computer">
            <label for="computer">Computer</label><br>
            <input type="radio" id="itemType" name="itemType" value="cellphone">
            <label for="cellphone">Cell Phone</label><br>
            <input type="radio" id="itemType" name="itemType" value="printer">
            <label for="printer">Printer</label><br>
            <input type="radio" id="itemType" name="itemType" value="microWave">
            <label for="microwave">Microwave</label><br><br>
            
            <label>Item Size:</label><br><br>
            <input type="radio" id="itemSize" name="itemSize" value="small">
            <label for="small">Small</label><br>
            <input type="radio" id="itemSize" name="itemSize" value="medium">
            <label for="medium">Medium</label><br>
            <input type="radio" id="itemSize" name="itemSize" value="large">
            <label for="large">Large</label><br><br>
            
            <!--Model Number input-->
             <div id="upwd">Item Model Number:</div>                                 
            <input type="text", name="upwd" /><br/><br>
           
            <input type="submit", value="Submit" id="submit" /><br />
        </form>
    </body>
</html>
