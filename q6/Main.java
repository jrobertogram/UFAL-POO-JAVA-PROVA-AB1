package q6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Thalia");

        ArrayList<Conta> contas = new ArrayList<>();
        ContaCorrente cc = new ContaCorrente(500);
        contas.add(cc);
        ContaEspecial ce = new ContaEspecial(200);
        contas.add(ce);
        cliente.setContas(contas);

        Conta contaCorrente = cliente.getContas().get(0);

        if(contaCorrente.sacar(200)) {
            System.out.println("Saquei 200 reais da conta corrente \n restante "+ contaCorrente.toString());
        }

        Conta contaEspecial = cliente.getContas().get(1);
        if(contaEspecial.sacar(100)) {
            System.out.println("Sacando 100 reais da conta especial "+ contaEspecial.toString());
        }
    } 
}
