package q6;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Conta> contas;

    public Cliente() {}

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        return String.format("Nome do cliente: %s\n", this.nome);
    }
    
}
