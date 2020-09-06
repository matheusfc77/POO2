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
public class Gerente extends Funcionario implements IFuncionario {
    
    public Gerente(String nome, String idetificador) {
        super(nome, idetificador);
    }
    
    @Override
    public String info() {
        return "Gerente";
    }
    
}
