package q3;

public class Sistema {//Casa recebe a família-> ONDE FAZ O LOGIN DE FATO
  private Login login; 
  //chamando a interface login -> aceita tudo que tá relacionado ao Login

  public Sistema(Login login){
    this.login = login;
  }

  public Login getLogin() {
    return login;
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  //....
  public void logar(){
    System.out.println(login.logar());
  }
}
