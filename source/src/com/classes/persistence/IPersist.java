/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.persistence;

/**
 *
 * @author matheus
 */
public interface IPersist {
    
    String selectUser();
    
    String selectPassword();
    
    String selectHost();
    
    int selectPort();
    
}
