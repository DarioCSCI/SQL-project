/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.*;
import java.util.*;
import utils.MySQLConnection;

/**
 * Account - Represents a Poster's account
 * @author Jacob Hall
 */
public class Account {
    private String username;
    private String password;
    private double accountBalance;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    private Connection conn = null;
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public boolean login(String username, String password) {
        boolean validated = false; 
        
        // Poster interacts with the boundary to log-in to account
        
        try {
            
            // Get connection
            conn = MySQLConnection.getConnection();
            
            // Build SQL
            String sql = 
                    "select * from Account where " + 
                    "username = ? and password = ?";
            
            // Prepare the SQL db
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // set the values using the parameters
            // in the sql String: username and password
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            // Run SQL: get the result of the query
            ResultSet result = stmt.executeQuery();
            
            // If there is a "next" value then something is being 
            // returned, i.e. returns true. Therefore, the username 
            // and password are valid.
            if (result.next()) {
                
                // Set validated to true iff result.next() returns true
                validated = true;
                
            }
            
            
        } catch (Exception ex) {
            
            ex.printStackTrace();
            
        } finally {
            
            // Set conn to null to ease in garabage collection
            conn = null; 
            
            // Then close the connection
            MySQLConnection.closeConnection();
            
        }
        
        
        return validated;
    }
    
    public List<Account> getAccounts() {
      
        List<Account> accounts = new ArrayList<Account>();
        
        return accounts;
   
    }
    
}
