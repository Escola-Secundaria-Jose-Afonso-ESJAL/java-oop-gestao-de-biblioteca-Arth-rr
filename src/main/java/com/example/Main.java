package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro livro3 = new Livro("1984", "George Orwell", 1949);
    
        Biblioteca biblioteca1 = new Biblioteca();
        
        biblioteca1.adicionarLivro(livro1);
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.adicionarLivro(livro3);
        
        biblioteca1.listarLivros();
        
        System.out.println("\n" + biblioteca1.adicionarLivro(livro2));
        
        System.out.println("\n" + biblioteca1.removerLivro("O Senhor dos Anéis"));
        
        biblioteca1.listarLivros();
        
        System.out.println();
    }
}
