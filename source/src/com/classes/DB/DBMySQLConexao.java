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
public class DBMySQLConexao extends Database {
    
    public DBMySQLConexao () {
        super.setDataBase("conexao");
        super.setDriver("com.mysql.jdbc.Driver");
        super.setUrl("jdbc:mysql://localhost/" + super.getDataBase());
        super.setUser("matheus");
        super.setPassword("123456");
        super.setPort(3306);
        super.setHost("localhost");
    }
}
