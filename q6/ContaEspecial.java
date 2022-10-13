package q6;

class ContaEspecial extends ContaCorrente implements Conta{
    private float limite;

    public ContaEspecial( float limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (super.saldo + limite - valor > 0){
            super.saldo -= valor;
            return true;
        }else{
            return false;
        } 

    }

    @Override
    public String toString() {
        return String.format("%f\n", saldo+limite);
    }
}