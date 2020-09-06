/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.DTO;

/**
 *
 * @author matheus
 */
public class Client {
    
    private final String ipInterno;
    private String user;
    private String password;
    private String host;
    private int port;
    
    public Client(String ipInterno) {
        this.ipInterno = ipInterno;
    }

    public String getIpInterno() {
        return ipInterno;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Client{" + "ipInterno=" + ipInterno + ", user=" + user + ", password=" + password + ", host=" + host + ", port=" + port + '}';
    }
    
}
