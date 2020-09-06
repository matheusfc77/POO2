/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes.main;

import com.classes.livros.Livro;
import com.classes.livros.LivroDirector;
import com.classes.livros.LivroFiccao;
import com.classes.livros.LivroRomance;
import com.classes.livros.LivroTecnico;

/**
 *
 * @author matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Projeto para construção de livros.
        É possível configurar o título, autor, ano de publicação, 
        número de páginas e classificá-lo em ficção, romance ou técnico.
        */
        
        LivroDirector ld = new LivroDirector(new LivroFiccao());
        ld.construirLivro("Admirável Mundo Novo", "Aldous Huxley", 1932, 258);
        Livro l1 = ld.getLivro();
        System.out.println(l1);
        
        ld = new LivroDirector(new LivroRomance());
        ld.construirLivro("Helena", "Machado de Assis", 1876, 208);
        Livro l2 = ld.getLivro();
        System.out.println(l2);
        
        ld = new LivroDirector(new LivroTecnico());
        ld.construirLivro("Java Como Programar", "Paul Deitel", 1996, 968);
        Livro l3 = ld.getLivro();
        System.out.println(l3);
    }
    
}
