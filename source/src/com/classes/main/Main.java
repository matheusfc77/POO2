/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.main;

import com.classes.factory.FactoryFuncionario;
import com.classes.funcionarios.Funcionario;

/**
 *
 * @author matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FactoryFuncionario ff = new FactoryFuncionario();
        
        Funcionario f1 = ff.criarFuncionario("Matheus", "Programador");
        Funcionario f2 = ff.criarFuncionario("Jesiel", "Designer");
        Funcionario f3 = ff.criarFuncionario("Pedro", "Gerente");
        Funcionario f4 = ff.criarFuncionario("Henrique", "Analista");
        
        System.out.println(f1.info());
        System.out.println(f2.info());
        System.out.println(f3.info());
        System.out.println(f4.info());

    }
    
}
