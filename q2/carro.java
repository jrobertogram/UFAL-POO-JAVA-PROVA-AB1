package q2;

public class Carro {
  private String nome;
  protected int quantidadePessoas;

  public Carro(String nome, int quantidadePessoas) {
    this.nome = nome;
    this.quantidadePessoas = quantidadePessoas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidadePessoas() {
    return quantidadePessoas;
  }

  public void setQuantidadePessoas(int quantidadePessoas) {
    this.quantidadePessoas = quantidadePessoas;
  }
  
  
}
