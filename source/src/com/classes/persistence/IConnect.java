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
public interface IConnect {
    
    String getUser();
    
    String getPassword();
    
    String getHost();
    
    int getPort();
    
    String getDriver();

    String getDataBase();

    String getUrl();

}
