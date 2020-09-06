/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.DAO;

import com.classes.DTO.Client;
import com.classes.persistence.IPersist;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author matheus
 */
public class ClientDAO implements IPersist {
    
    private final Connection conn;
    private final Client client;
    
    public ClientDAO (Connection conn, Client client) {
        this.conn = conn;
        this.client = client;
    }

    @Override
    public String selectUser() {
        
        String user = null;
        
        try {
            PreparedStatement ps = this.getConn().prepareStatement("SELECT user from CONEXAO_CLIENTE WHERE ip_cliente = ?");
            ps.setString(1, getClient().getIpInterno());
            ResultSet rs = ps.executeQuery();
            user = rs.getString(1);
            getClient().setUser(user);
            ps.close();
            rs.close();
            conn.close();
            
        } catch (SQLException e1) {
            System.err.println("Erro: " + e1.toString());
            e1.printStackTrace();
        
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
        }
        
        return user;
    }

    @Override
    public String selectPassword() {
        
        String password = null;
        
        try {
            PreparedStatement ps = this.getConn().prepareStatement("SELECT password from CONEXAO_CLIENTE WHERE ip_cliente = ?");
            ps.setString(1, getClient().getIpInterno());
            ResultSet rs = ps.executeQuery();
            password = rs.getString(1);
            getClient().setPassword(password);
            ps.close();
            rs.close();
            conn.close();
            
        } catch (SQLException e1) {
            System.err.println("Erro: " + e1.toString());
            e1.printStackTrace();
        
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
        }
        
        return password;
    }

    @Override
    public String selectHost() {
        
        String host = null;
        
        try {
            PreparedStatement ps = this.getConn().prepareStatement("SELECT host from CONEXAO_CLIENTE WHERE ip_cliente = ?");
            ps.setString(1, getClient().getIpInterno());
            ResultSet rs = ps.executeQuery();
            host = rs.getString(1);
            getClient().setHost(host);
            ps.close();
            rs.close();
            conn.close();
            
        } catch (SQLException e1) {
            System.err.println("Erro: " + e1.toString());
            e1.printStackTrace();
        
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
        }
        
        return host;
    }

    @Override
    public int selectPort() {
        
        int port = 0;
        
        try {
            PreparedStatement ps = this.getConn().prepareStatement("SELECT port from CONEXAO_CLIENTE WHERE ip_cliente = ?");
            ps.setString(1, getClient().getIpInterno());
            ResultSet rs = ps.executeQuery();
            port = rs.getInt(1);
            getClient().setPort(port);
            ps.close();
            rs.close();
            conn.close();
            
        } catch (SQLException e1) {
            System.err.println("Erro: " + e1.toString());
            e1.printStackTrace();
        
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
        }
        
        return port;
    }

    public Connection getConn() {
        return conn;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "ClientDAO{" + "conn=" + conn + ", client=" + client + '}';
    }

}
