/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.factory;

import com.classes.funcionarios.Funcionario;

/**
 *
 * @author matheus
 */
public class FactoryFuncionario implements IFactoyFuncionario {

    @Override
    public Funcionario criarFuncionario(String nome, String identificador) {
        
        Funcionario fnc;
        
        switch (identificador.toLowerCase()) {
            
            case "programador":
                FactoryProgramador fp = new FactoryProgramador();
                fnc = fp.criarFuncionario(nome, identificador);
                break;
                
            case "designer":
                FactoryDesigner fd = new FactoryDesigner();
                fnc = fd.criarFuncionario(nome, identificador);
                break;
                
            case "gerente":
                FactoryGerente fg = new FactoryGerente();
                fnc = fg.criarFuncionario(nome, identificador);
                break;
                
            default:
                fnc = new Funcionario(nome, identificador);
                break;
        }
        
        return fnc;
    }
    
    
}
