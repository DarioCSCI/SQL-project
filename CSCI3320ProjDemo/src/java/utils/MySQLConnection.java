/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.*;

/**
 *
 * @author jacobhall
 */
public class MySQLConnection {
    private static Connection conn = null;
    private static String url = "jdbc:mysql://localhost:3306/csci3320demo" + 
                                "?useSSL=false&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "";
    
    /**
     * getConnection - establishes the connection to the SQL database
     * @return 
     */
    public static Connection getConnection() {
        
        try {
            
            // Get MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Setup Connection
            conn = DriverManager.getConnection(url, user, password);
            
        }catch (Exception ex) {
            
            ex.printStackTrace();
        
        }
        
        return conn;
        
    }
    
    /**
     * closeConnection - closes the connection to the SQL database
     */
    public static void closeConnection() {
        
        try {
            
            conn.close();
            
        }catch (Exception ex) {
            
            ex.printStackTrace();
            
        }
        
        
    }
    
    public static void main(String[] args) {
        
        try {
            
            // Get Connection
            Connection connection = MySQLConnection.getConnection();
            
            // Build SQL
            String sql = "show tables";
            
            // Set SQL to Server DB
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            // Excute SQL
            ResultSet result = stmt.executeQuery();
            
            // Process result set using the next() method
            System.out.println("Fetching tables/data...\n");
            
            int i = 1;
            
            System.out.println("Tables\n______\n");
            while (result.next()) {
               
                System.out.println(i++ + ": " + result.getString(1));
                
            }
            
            System.out.println("\nDONE.");
            
        } catch (Exception ex) {
            
            ex.printStackTrace();
            
        } finally {
            
            // Don't set conn = null. Will cause error
            MySQLConnection.closeConnection();
            
        }
    }
    
}
