/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.singleton;

import com.classes.DAO.ClientDAO;
import com.classes.DB.DBMySQL;
import com.classes.DB.DBMySQLConexao;
import com.classes.DTO.Client;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import com.classes.persistence.IConnect;

/**
 *
 * @author matheus
 */

public class Conexao {
    
    private static Conexao conn;
    private static Connection connDB;
    
    private Conexao() {
        try {
            // identifica o cliente
            String IPINTERNO = "192.168.0.1";
            
            IConnect configCon = new DBMySQLConexao();
            Client cl = new Client(IPINTERNO);

            Class.forName(configCon.getDriver());
                        
            try (Connection connConexao = DriverManager.getConnection(configCon.getUrl(), configCon.getUser(), configCon.getPassword())) {
                ClientDAO dao = new ClientDAO(connConexao, cl);
                dao.selectUser();
                dao.selectPassword();
                dao.selectHost();
                dao.selectPort();
            }
            
            DBMySQL connMS = new DBMySQL(cl.getUser(), cl.getPassword(), cl.getHost(), cl.getPort());
            
            Conexao.connDB = DriverManager.getConnection(connMS.getUrl(), connMS.getUser(), connMS.getPassword());
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.toString());
        }
    }
    
    public static Conexao getInstance() {
        if (conn == null) {
            conn = new Conexao();
        }
        return conn;
    }

    public static Connection getConnDB() {
        return connDB;
    }
    
}
