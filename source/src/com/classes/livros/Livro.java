/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.livros;

/**
 *
 * @author matheus
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numPaginas;
    private boolean ficcao;
    private boolean romance;
    private boolean tecnico;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isFiccao() {
        return ficcao;
    }

    public void setFiccao(boolean ficcao) {
        this.ficcao = ficcao;
    }

    public boolean isRomance() {
        return romance;
    }

    public void setRomance(boolean romance) {
        this.romance = romance;
    }

    public boolean isTecnico() {
        return tecnico;
    }

    public void setTecnico(boolean tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao +
            ", numPaginas=" + numPaginas + ", ficcao=" + ficcao + ", romance=" + romance + ", tecnico=" + tecnico + '}';
    }
    
}
