/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.DB;

import com.classes.persistence.IConnect;

/**
 *
 * @author matheus
 */
public class Database implements IConnect {
    
    private String dataBase;
    private String driver;
    private String url;
    private String user;
    private String password;
    private String host;
    private int port;
    
    @Override
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Override
    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }
    
    @Override
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Database{" + "dataBase=" + dataBase + 
                ", driver=" + driver + 
                ", url=" + url + 
                ", user=" + user + 
                ", password=" + password + 
                ", host=" + host + 
                ", port=" + port + '}';
    }

}
