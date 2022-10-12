package q2;

public class Main {

  public static void main(String[] args) {

    carro c1 = new carro("Gol", 2);
    carro c2 = new carro("BMW", 1);
    carro c3 = new carro("Fusca", 3);
    estacionamento est = new estacionamento();

    carro[] carros = new carro[3];

		carros[0] = c1;
		carros[1] = c2;
    carros[2] = c3;
		
		est.setCarros(carros);
    est.get_quantidade_pessoa_total();
    System.out.println( est.get_quantidade_pessoa_total());
    est.lista_Carros();


  }
}
