package q1;

import java.util.ArrayList;


public class compra {
  public static void main(String[] args) {

    ArrayList<Produto> produtos = new ArrayList<>();
    Produto p1 = new Produto("bolo", 70);
    Produto p2 = new Produto("arroz", 5);
    Produto p3 = new Produto("feijao", 50);
    produtos.add(p1);
    produtos.add(p2);
    produtos.add(p3);

    carrinhoo car = new carrinhoo();
		
		car.setProdutos(produtos);
    System.out.println(car.getPreco_total());
    car.lista_Produtos();


  }
}
