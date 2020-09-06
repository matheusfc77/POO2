/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.main;

import com.classes.singleton.Conexao;

/**
 *
 * @author matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conexao conn = Conexao.getInstance();
        System.out.println(conn);
        System.out.println(Conexao.getConnDB());
        
    }
    
}
