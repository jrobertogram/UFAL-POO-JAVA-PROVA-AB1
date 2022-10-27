package q2;

public class Estacionamento {
  private int quantidadePessoasTotal;
  private Carro[] carros;

  //Construtor
  public Estacionamento() {
  }

  //Getters e Setters
  public int getQuantidadePessoasTotal() { //** */
    this.quantidadePessoasTotal = 0;
    for (Carro carro:carros){
      double qp = carro.quantidadePessoas;
      this.quantidadePessoasTotal += qp;
    }
    return quantidadePessoasTotal;
  }

  public void setQuantidadePessoasTotal(int quantidadePessoasTotal) {
    this.quantidadePessoasTotal = quantidadePessoasTotal;
  }

  public Carro[] getCarros() {
    return carros;
  }

  public void setCarros(Carro[] carros) {
    this.carros = carros;
  }
  
  // Método Personalizado
  public void listaCarros(){
    for (Carro carro: carros){
      System.out.println(carro.getNome() + " - " +carro.getQuantidadePessoas());
    }
  }
  
}
