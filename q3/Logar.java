package q3;
public class Logar {

  public Logar(int idLogin) {
    opcoesLogin opl = new opcoesLogin();
    Login[] lgs = opl.getLogins();

    for (Login login: lgs){
      if (login.getId() == idLogin){
        System.out.println("Logado com Sucesso no: " + login.getTipo());
      }
    }  
  } 
}
