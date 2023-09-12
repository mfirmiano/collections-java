package src.main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Mateus 0", 123456);
        agendaContatos.adicionarContato("Mateus 1", 234567);
        agendaContatos.adicionarContato("Mateus 2", 345678);
        agendaContatos.adicionarContato("Mateus 3", 456789);
        agendaContatos.adicionarContato("Mateus 4", 567890);
        agendaContatos.adicionarContato("Mateus 5", 678901);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Mateus 2");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Mateus 5"));

    }
}
