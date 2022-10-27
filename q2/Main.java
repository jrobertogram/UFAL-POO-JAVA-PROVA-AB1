package q2;

public class Main {
  public static void main (String[] args){
    Carro c1 = new Carro ("Jaguar", 1);
    Carro c2 = new Carro ("BMW", 3);
    Carro c3 = new Carro ("Hilux", 4);

    Carro[] carros = new Carro[3];
    carros[0] = c1;
		carros[1] = c2;
    carros[2] = c3;

    Estacionamento est = new Estacionamento();

    est.setCarros(carros);
    est.listaCarros();
    System.out.println("Total de Pessoas: " + est.getQuantidadePessoasTotal());
  }

}
