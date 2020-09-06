/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.DB;

/**
 *
 * @author matheus
 */
public class DBMySQL extends Database {
    
    public DBMySQL (String user, String password, String host, int port) {
        super.setDataBase("mvcsimplesjdbc");
        super.setDriver("com.mysql.jdbc.Driver");
        super.setUrl("jdbc:mysql://localhost/" + super.getDataBase());
        super.setUser(user);
        super.setPassword(password);
        super.setPort(port);
        super.setHost(host);
    }
    
}
