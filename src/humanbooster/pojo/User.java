package humanbooster.pojo;

import humanbooster.myTools.DateManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private static int userCount = 0;
    private int idUser;
    /**
     * le login sera son adresse email
     */
    private String login;
    private String pseudo;
    private String password;
    private Date registerDate;


    public User(){}
    public User(String _pseudo, String _login, String _password)
    {
        this.pseudo = _pseudo;
        this.login = _login;
        this.password = _password;
        this.registerDate = new Date();
        this.idUser = userCount++;

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }



    @Override
    public String toString() {
        return "User{" +
                "id : "+ idUser +
                "login='" + login + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", registerDate=" + DateManager.formatDate(registerDate)+
                '}';
    }
}
