package src.main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{
    private List<Livro> catalogoLivros;
    public CatalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!autor.isEmpty()){
            for (Livro l:catalogoLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                    System.out.println("Livro adicionado: " + l.getTitulo() + ". autor: " + l.getAutor() + ". Ano: " + l.getAnoPublicacao());
                }
            }
            return livrosPorAutor;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!catalogoLivros.isEmpty()){
            for (Livro l:catalogoLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
            return livrosPorIntervalo;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!titulo.isEmpty()){
            for (Livro l:catalogoLivros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo.add(l);
                }

            }
            return livrosPorTitulo;
        } else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
