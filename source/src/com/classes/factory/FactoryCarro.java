/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.factory;

import com.classes.carros.Carro;

/**
 *
 * @author matheus
 */
public class FactoryCarro implements IFactoryCarro {

    @Override
    public Carro criarCarro(String placa, String modelo, String marca) {
        
        Carro car;
        
        switch (marca.toLowerCase()) {
            case "porsche":
                FactoryPorsche fp = new FactoryPorsche();
                car = fp.criarCarro(placa, modelo, marca);
                break;
                
            case "tesla":
                FactoryTesla ft = new FactoryTesla();
                car = ft.criarCarro(placa, modelo, marca);
                break;
                
            case "audi":
                FactoryAudi fa = new FactoryAudi();
                car = fa.criarCarro(placa, modelo, marca);
                break;
                
            default:
                car = new Carro(placa, modelo, marca);
        }
        
        return car;
    }
    
}
