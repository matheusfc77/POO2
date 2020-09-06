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
public class Funcionario implements IFuncionario {
    
    private String nome;
    private String idetificador;

    public Funcionario(String nome, String idetificador) {
        this.nome = nome;
        this.idetificador = idetificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdetificador() {
        return idetificador;
    }

    public void setIdetificador(String idetificador) {
        this.idetificador = idetificador;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", idetificador=" + idetificador + '}';
    }
    
}
