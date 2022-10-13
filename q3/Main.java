package q3;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    opcoesLogin opl = new opcoesLogin();
		
		opl.lista_Logins();

    System.out.print("Digite um número das opçoes acima para Logar: ");
    Scanner entrada = new Scanner(System.in);
    String stridLogin = entrada.nextLine();

    int idLogin = Integer.parseInt(stridLogin);

    Logar lg = new Logar(idLogin);
  }
}
