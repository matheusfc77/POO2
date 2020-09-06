/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.factory;

import com.classes.funcionarios.Funcionario;
import com.classes.funcionarios.Programador;

/**
 *
 * @author matheus
 */
public class FactoryProgramador implements IFactoyFuncionario {

    @Override
    public Funcionario criarFuncionario(String nome, String identificador) {
        return new Programador(nome, identificador);
    }
    
}
