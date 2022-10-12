package q1;
public class carrinhoo {
  private int quantidade;
  private double preco_total;
  private Produto[] produtos;


  public int getQuantidade() {
    return quantidade;
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public double getPreco_total() {
    this.preco_total = 0;
    for (Produto produto: produtos){
      double preco = produto.valor;
      this.preco_total += preco;
    }
    return preco_total;
  }
  public void lista_Produtos(){
    for (Produto produto: produtos){
      System.out.println(produto.getNome() + " - " + produto.getValor());
    }
  }

  public void setPreco_total(float preco_total) {
    this.preco_total = preco_total;
  }
  public Produto[] getProdutos() {
    return produtos;
  }
  public void setProdutos(Produto[] produtos) {
    this.produtos = produtos;
  }

  

}


