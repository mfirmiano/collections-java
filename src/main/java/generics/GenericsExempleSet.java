package src.main.java.generics;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        //Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10); //Permite adicionar qualquer tipo de objeto

        //Exemplo com Generics
        Set<String> conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 01");
        conjuntoGenerics.add("Elemento 02");

        System.out.println("Com Generics: ");
        for (String elemento : conjuntoGenerics) {
            System.out.println(elemento + ", tipo : " + elemento.getClass().getSimpleName());

        }

        System.out.println("Sem Generics: ");
        for (Object objeto:conjuntoSemGenerics) {
            System.out.println(objeto + ", tipo : " + objeto.getClass().getSimpleName());
        }

    }
}
