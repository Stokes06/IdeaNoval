package humanbooster.pojo;

import humanbooster.myTools.DateManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    /**
     * le login sera son adresse email
     */
    private String login;
    private String pseudo;
    private String password;
    private Date registerDate;
    private List<Commentary> commentaries;
    private List<Mark> marks;
    private List<Answer> answers;

    public User(){}
    public User(String _pseudo, String _login, String _password)
    {
        this.pseudo = _pseudo;
        this.login = _login;
        this.password = _password;
        this.registerDate = new Date();
        commentaries = new ArrayList<>();
        marks = new ArrayList<>();
        answers = new ArrayList<>();
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

    public List<Commentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<Commentary> commentaries) {
        this.commentaries = commentaries;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", password='" + password + '\'' +
                ", registerDate=" + DateManager.formatDate(registerDate)+
                '}';
    }
}
