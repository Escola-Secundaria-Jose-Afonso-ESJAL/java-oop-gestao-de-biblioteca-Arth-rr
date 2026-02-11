package com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if(!checkLivrosSizeLimit()){
            return false;
        }
        
        int count = 0;
        
        for (Livro livroTemp : this.livros){
            if(matchtTitulosLivros(livroTemp, livro.getTitulo())){return false;}
            count++;
        }
        
        this.livros.add(livro);
        return false;
    }

    public boolean checkLivrosSizeLimit(){
        return this.livros.size() <= MAX_LIVROS;
    }
    
    public boolean matchtTitulosLivros(Livro livroTemp, String titulo){
        return livroTemp.getTitulo().equals(titulo);
    }
    
    public boolean removerLivro(String titulo) {
        int count = 0;
        
        for (Livro livroTemp : this.livros){
            if(matchtTitulosLivros(livroTemp, titulo)){
                this.livros.remove(count);
                return true;
            }
            
            count++;
        }
        
        return false;
    }

    public void listarLivros() {
        for (Livro livroTemp : this.livros){
            System.out.println(livroTemp);
        }
        
    }
}
