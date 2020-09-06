/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.carros;

/**
 *
 * @author matheus
 */
public class Tesla extends Carro implements ICarro {
    
    public Tesla(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
    }
    
    @Override
    public String info() {
        return "toStringTesla: " + super.toString();
    }
    
}
