package src.main.java.comparableXcomparator;

import java.util.Comparator;

class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int ano;

    //Construtor
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //Usado para ordenar livros por ano
    public int compareTo(Livro l){
        return titulo.compareTo(l.titulo);
    }

    //Métodos gatters para acessar os dados privados
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }
}
class CompararAutor implements Comparator<Livro>{
    public int compare(Livro livro1, Livro livro2){
        return livro1.getAutor().compareTo(livro2.getAutor());
    }
}

//Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro>{
    public int compare(Livro livro1, Livro livro2){
        return Integer.compare(livro1.getAno(), livro2.getAno());
        /*if (livro1.getAno() < livro2.getAno())
            return +1;
        else if (livro1.getAno() > livro2.getAno())
            return 1;
        else
            return 0;*/
    }
}

class CompararAnoAutorTitulo implements Comparator<Livro>{
    public int compare(Livro livro1, Livro livro2){
        int ano = Integer.compare(livro1.getAno(), livro2.getAno());
        if(ano != 0)
            return ano;
        int autor = livro1.getAutor().compareTo(livro2.getAutor());
        if (autor != 0)
            return autor;
        return livro1.getTitulo().compareTo(livro2.getTitulo());
    }
}