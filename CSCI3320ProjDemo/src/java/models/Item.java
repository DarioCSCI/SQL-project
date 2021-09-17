/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.MySQLConnection;

/**
 *
 * @author jacobhall
 */
public class Item {
    private String itemType;
    private String itemSize;
    private String modelNumber;
    private String itemStatus;
    private double itemValue;
    private boolean isPickedUp;
    private Address address;

    
    public Item() {
        
    }
    public Item(String itemType, String itemSize, String modelNumber) {
        
        this.itemType = itemType;
        this.itemSize = itemSize;
        this.modelNumber = modelNumber;
        
    }
    public String getItemStatus() { return this.itemStatus; }
    public String getItemType() { return this.itemType; }
    public void setItemType(String itemType) { this.itemType = itemType;}
    public String getItemSize() { return this.itemSize;}
    public void setItemSize(String itemSize) { this.itemSize = itemSize; }
    public String getModelNumber() { return this.modelNumber; }
    public void setModelNumber(String modelNumber) { this.modelNumber = modelNumber; }
    public double getItemValue() { return this.itemValue; }
    public void setItemValue(double value) { this.itemValue = value; }
    public void setItemStatus(String itemStatus) {
        
        this.itemStatus = itemStatus;
        
    }
    public void setPickup(boolean isPickedUp) {
        
        //this.isPickedUp = isPickedUp;
        
    }
    
    public List<Item> getItems(){
        List<Item> items = new ArrayList<>();
        
        try{
            Connection conn = MySQLConnection.getConnection();
            String sql = "select itemType, itemSize, modelNum, itemValue, itemStatus from item";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               Item item = new Item();
               item.setItemType(rs.getString(1));
               item.setItemSize(rs.getString(2));
               item.setModelNumber(rs.getString(3));
               item.setItemValue(rs.getString(4));
               item.setItemStatus(rs.getString(5));
               items.add(item);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            MySQLConnection.closeConnection();
        }
        
        return items;
    }

    private void setItemValue(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
