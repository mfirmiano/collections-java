package src.main.java.list.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoList;
    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for (Item i:carrinhoList) {
            if (i.getNome().equalsIgnoreCase(nome)){
                carrinhoList.remove(i);
            }
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i:carrinhoList) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        for (Item i:carrinhoList) {
            System.out.println("Item: " + i.getNome() + ". Preço: R$ " + i.getPreco() + ". Quantidade: " + i.getQuantidade());
        }
    }

    public int obterNumeroTotalItens(){
        int quantidade = 0;
        for (Item i:carrinhoList) {
            quantidade += i.getQuantidade();
        }
        return quantidade;
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("Quantidade de itens no carrinho: " + carrinhoDeCompras.obterNumeroTotalItens());

        carrinhoDeCompras.adicionarItem("Charge", 1.5, 1);
        carrinhoDeCompras.adicionarItem("Suflair", 2.5, 5);
        carrinhoDeCompras.adicionarItem("Lolo", 1.0, 1);

        System.out.println("Quantidade de itens no carrinho: " + carrinhoDeCompras.obterNumeroTotalItens());
        carrinhoDeCompras.exibirItens();

        System.out.println("Valor total: R$ " + carrinhoDeCompras.calcularValorTotal());


    }
}
