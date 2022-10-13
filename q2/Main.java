package q2;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Carro c1 = new Carro("Gol", 2);
    Carro c2 = new Carro("BMW", 1);
    Carro c3 = new Carro("Fusca", 3);
    estacionamento est = new estacionamento();

    ArrayList<Carro> carros = new ArrayList<>();

    carros.add(c1);
    carros.add(c2);
    carros.add(c3);
		
		est.setCarros(carros);
    est.get_quantidade_pessoa_total();
    System.out.println( est.get_quantidade_pessoa_total());
    est.lista_Carros();


  }
}
