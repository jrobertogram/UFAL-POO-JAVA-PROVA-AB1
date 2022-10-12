package q2;
public class estacionamento {
  private int quantidade_pessoa_total;
  private carro[] carros;


  public double get_quantidade_pessoa_total() {
    this.quantidade_pessoa_total = 0;
    for (carro carro: carros){
      double qp = carro.quantidade_pessoa;
      this.quantidade_pessoa_total += qp;
    }
    return quantidade_pessoa_total;
  }

  public void lista_Carros(){
    for (carro carro: carros){
      System.out.println(carro.getNome() + " - " + carro.getQuantidade_pessoa());
    }
  }
  public int getQuantidade_pessoa_total() {
    return quantidade_pessoa_total;
  }
  public void setQuantidade_pessoa_total(int quantidade_pessoa_total) {
    this.quantidade_pessoa_total = quantidade_pessoa_total;
  }
  public carro[] getCarros() {
    return carros;
  }
  public void setCarros(carro[] carros) {
    this.carros = carros;
  }
  
}


