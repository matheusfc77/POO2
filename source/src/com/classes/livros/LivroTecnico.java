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
public class LivroTecnico implements ILivro {
    
    @Override
    public void titulo(String titulo) {
        livro.setTitulo(titulo);
    }

    @Override
    public void autor(String autor) {
        livro.setAutor(autor);
    }

    @Override
    public void anoPublicacao(int anoPublicacao) {
        livro.setAnoPublicacao(anoPublicacao);
    }

    @Override
    public void numPaginas(int numPaginas) {
        livro.setNumPaginas(numPaginas);
    }

    @Override
    public void ficcao() {
        livro.setFiccao(false);
    }

    @Override
    public void romance() {
        livro.setRomance(false);
    }

    @Override
    public void tecnico() {
        livro.setTecnico(true);
    }
    
}
