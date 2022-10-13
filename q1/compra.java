package q1;

import java.util.ArrayList;


public class compra {
  public static void main(String[] args) {

    ArrayList<Produto> contas = new ArrayList<>();
    Produto p1 = new Produto("bolo", 70);
    Produto p2 = new Produto("arroz", 5);
    Produto p3 = new Produto("feijao", 50);
    contas.add(p1);
    contas.add(p2);
    contas.add(p3);

    carrinhoo car = new carrinhoo();

    Produto[] produtos = new Produto[3];

		produtos[0] = p1;
		produtos[1] = p2;
    produtos[2] = p3;
		
		car.setProdutos(produtos);
    System.out.println(car.getPreco_total());
    car.lista_Produtos();


  }
}
