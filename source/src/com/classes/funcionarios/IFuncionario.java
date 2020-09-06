/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.funcionarios;

/**
 *
 * @author matheus
 */
public interface IFuncionario {
    
    public default String info() {
        return "Genérico";
    };
    
}
