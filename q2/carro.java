package q2;

public class carro {
  private String nome;
  double quantidade_pessoa;
  
  public carro(String nome, double quantidade_pessoa) {
    this.nome = nome;
    this.quantidade_pessoa = quantidade_pessoa;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getQuantidade_pessoa() {
    return quantidade_pessoa;
  }
  public void setQuantidade_pessoa(double quantidade_pessoa) {
    this.quantidade_pessoa = quantidade_pessoa;
  } 
}
