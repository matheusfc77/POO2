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
public class LivroDirector {
    
    protected ILivro builder;
    
    public LivroDirector(ILivro builder) {
        this.builder = builder;
    }
    
    public void construirLivro(String titulo, String autor, int anoPublicacao, int numPaginas) {
        builder.autor(autor);
        builder.titulo(titulo);
        builder.anoPublicacao(anoPublicacao);
        builder.numPaginas(numPaginas);
        builder.romance();
        builder.tecnico();
        builder.ficcao();
    }
    
    public Livro getLivro() {
        return builder.build();
    }
    
}
