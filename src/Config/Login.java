
package Config;

public class Login { 
    
    private String login;
    private String senha;
    private boolean logged = false;

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }    
    
    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean Logar (String login, String senha){
        logged = this.login.equals(login) && this.senha.equals(senha);        
        return logged;   
    }
}
