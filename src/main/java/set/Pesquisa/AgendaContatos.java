package src.main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c:contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Mateus", 123456);
        agendaContatos.adicionarContato("Mateus", 0);
        agendaContatos.adicionarContato("Mateus Firmiano", 11111121);
        agendaContatos.adicionarContato("Mateus DIO", 122222);
        agendaContatos.adicionarContato("Mateus C Firm", 2223233);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Mateus Firmiano"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Mateus Firmiano", 1299701050));

        agendaContatos.exibirContatos();
    }
}
