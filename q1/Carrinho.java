package q1;
import java.util.ArrayList;

public class Carrinho {
  private int quatidade;
  private double precoTotal;
  private ArrayList<Produto> produtos = new ArrayList<>();

  //Método Construtor
  public Carrinho(){

  }

  //Métodos Getters e Setters
  public int getQuatidade() {
    return quatidade;
  }
 
  public void setQuatidade(int quatidade) {
    this.quatidade = quatidade;
  }
  
  public double getPrecoTotal() { // ** 
    this.precoTotal = 0;
    for (Produto p: produtos){
      double preco = p.valor;
      this.precoTotal += preco;
    }
    return precoTotal;
  }

  public void setPrecoTotal(double precoTotal) {
    this.precoTotal = precoTotal;
  }
  
  public ArrayList<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(ArrayList<Produto> produtos) {
    this.produtos = produtos;
  }
  
  //Metodo Personalizado
  public void listaProdutos(){
    for (Produto p: produtos){
      System.out.println(p.getNome() + " - " + p.getValor());
    }
  }
  public void addProduto(Produto produto){
    this.produtos.add(produto);
  }
}

