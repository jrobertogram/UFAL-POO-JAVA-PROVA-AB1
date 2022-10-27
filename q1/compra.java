package q1;

public class Compra {
  public static void main(String[] args) {
    Produto p1 = new Produto("Bolo", 70);
    Produto p2 = new Produto("Arroz", 5);
    Produto p3 = new Produto("Feijao", 55);

    Carrinho car = new Carrinho();

    car.addProduto(p1);
    car.addProduto(p2);
    car.addProduto(p3);

    car.listaProdutos();
    System.out.println("Preço Total: " + car.getPrecoTotal()); 


  }
}
