package src.main.java.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenericsExempleList {
    public static void main(String[] args) {
        List listaSemGenerics = new ArrayList();
        //Exemplo sem Generics
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add("Elemento 2");
        listaSemGenerics.add(10);

        //Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Element 01");
        listaGenerics.add("Element 02");

        System.out.println("Com Generics: ");
        //Interando sobre a lista com Generics
        for (String elemento: listaGenerics) {
            System.out.println(elemento + ", tipo : " + elemento.getClass().getSimpleName());
        }

        System.out.println("Sem Generics: ");
        //Iterando sobre a lista sem Generics
        for (Object elemento:listaSemGenerics) {
            //String str = (String) elemento;
            System.out.println(elemento + ", tipo : " + elemento.getClass().getSimpleName());
        }
    }
}
