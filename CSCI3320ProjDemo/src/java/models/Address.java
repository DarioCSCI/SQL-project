/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable; // This class allows for a thread to be safe

/**
 *
 * @author jacobhall
 */
public class Address implements Serializable {
    private String street, city, state, country; 
    private int zipcode;
    
    
}
