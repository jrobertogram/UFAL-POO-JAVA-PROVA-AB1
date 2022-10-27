package q3;

public class Main {
  public static void main(String[] args) {
    
    Formulario forme = new Formulario(); //mae
    Facebook face = new Facebook(); //eu
    Google gg = new Google(); //thi
    
    Sistema sis = new Sistema(forme); //iniciando com o formulario
    sis.logar();

    sis.setLogin(face);
    sis.logar();
    
    sis.setLogin(gg);
    sis.logar();
  }
}
