package q4;

public class Main {

    public static void main(String[] args) {
        Boleto b = new Boleto();

        PagamentoPapagaio pagamento = new PagamentoPapagaio();
        pagamento.pagar(b);

        PIX p = new PIX();
        pagamento.pagar(p);
    }

}

//Suponha que você irá desenvolver um módulo de pagamento para um
//aplicativo. O módulo deve ter suporte aos seguintes tipos de
//pagamento: PIX, Cartão de Crédito ou Boleto. Desenvolva sua solução
//com a flexibilidade de optar por um dos métodos de pagamento. Além
//disso, deve ser possível adicionar novos métodos de pagamento no
//futuro.