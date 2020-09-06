/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.factory;

import com.classes.carros.Audi;
import com.classes.carros.Carro;

/**
 *
 * @author matheus
 */
public class FactoryAudi implements IFactoryCarro {

    @Override
    public Carro criarCarro(String placa, String modelo, String marca) {
        return new Audi(placa, modelo, marca);
    }
    
}
