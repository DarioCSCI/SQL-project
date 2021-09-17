/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import utils.MySQLConnection;

/**
 *
 * @author jacobhall
 */
public class PickupItem {
    private Item item;
    private int itemQuantity;
    String postDate;
    String expirationDate;
    String pickupDate;
    private Connection conn = null;
    
    public PickupItem(Item item) {
        
        this.item = item;
        this.itemQuantity = 0;
        setPostDate();
        setExpirationDate();
        setPickupDate();
        
    }
    
    public void setPostDate() {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        postDate = dtf.format(now);
        
    }
    public void setExpirationDate() {
        
        expirationDate = "";
        
        
    }
    public void setPickupDate() {
        
        pickupDate = "";
        
    }
    public void postItem() {
        
        // Poster interacts with the boundary to log-in to account
        
        try {
            
            // Get connection
            conn = MySQLConnection.getConnection();
            
            // Build SQL
            String sql = 
                    "insert into PostedItem(ID, item, quantity, postDate, expirationDate, pickupDate) " + 
                    "values ('?', ?', '?', '?', '?', '?')";
            
            // Prepare the SQL db
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // set the values using the parameters
            // in the sql String: username and password
            stmt.setObject(2, item);
            stmt.setInt(3, itemQuantity);
            stmt.setString(4, postDate);
            stmt.setString(5, expirationDate);
            stmt.setString(6, pickupDate);
            
            // Run SQL: get the result of the query
            stmt.executeQuery();
            
        } catch (Exception ex) {
            
            ex.printStackTrace();
            
        } finally {
            
            // Set conn to null to ease in garabage collection
            conn = null; 
            
            // Then close the connection
            MySQLConnection.closeConnection();
            
        }
        
    }
    
    
}
