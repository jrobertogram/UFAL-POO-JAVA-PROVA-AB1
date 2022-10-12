package q3;

public class opcoesLogin {
  private Login[] logins;

  public opcoesLogin() {

    Login l1 = new Login("Formulario", 1);
    Login l2 = new Login("Google", 2);
    Login l3 = new Login("Facebook", 3);
    Login l4 = new Login("iCloud", 4);

    Login[] logins = new Login[4];

		logins[0] = l1;
		logins[1] = l2;
    logins[2] = l3;
    logins[3] = l4;

    this.setLogins(logins);

  }

  public void lista_Logins(){
    for (Login login: logins){
      System.out.println(login.getId()+": "+login.getTipo());
    }
  }

  public Login[] getLogins() {
    return logins;
  }

  public void addLogin(String nome) {
    
  }

  public void setLogins(Login[] logins) {
    this.logins = logins;
  }

  

  
}