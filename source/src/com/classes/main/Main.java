/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.main;

import com.classes.carros.Carro;
import com.classes.factory.FactoryCarro;

/**
 *
 * @author matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FactoryCarro fc = new FactoryCarro();
        
        Carro c1 = fc.criarCarro("ERSAK32764", "Taycan", "Porsche");
        Carro c2 = fc.criarCarro("JHJDA98435", "Model X", "Tesla");
        Carro c3 = fc.criarCarro("CNAJSN7843", "RS5", "Audi");
        Carro c4 = fc.criarCarro("HDASK89320", "Range Rover Evoque", "Land Rover");
        
        System.out.println(c1.info());
        System.out.println(c2.info());
        System.out.println(c3.info());
        System.out.println(c4.info());


    }
    
}
