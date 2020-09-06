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
public interface ILivro {
    
    Livro livro = new Livro();
    
    public void titulo(String titulo);
    public void autor(String autor);
    public void anoPublicacao(int anoPublicacao);
    public void numPaginas(int numPaginas);
    public void ficcao();
    public void romance();
    public void tecnico();
    
    public default Livro build() {
        return livro;
    }
}
