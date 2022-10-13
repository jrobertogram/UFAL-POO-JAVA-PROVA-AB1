package q6;

public class ContaCorrente implements Conta{

    protected double saldo;
    

    
    ContaCorrente() {
        saldo = 0;
    }

    ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }else{
            System.out.println("Valor inválido");
        }
    }

    public boolean sacar(double valor) {
        if(saldo - valor > 0){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    boolean transferir(ContaCorrente conta) {
        double valor = this.saldo;
        this.sacar(valor);
        conta.depositar(valor);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%f\n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}