package humanbooster.pojo;


import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private List<Idea> ideas;
    private List<CommentaryAlert> commentariesAlerts;
    private List<IdeaAlert> ideasAlerts;
    private boolean isValidated;
    private boolean isDeleted;

    public Client(String _pseudo, String _login, String _password)
    {
        super(_pseudo,_login, _password);
        ideas = new ArrayList<>();
        commentariesAlerts = new ArrayList<>();
        ideasAlerts = new ArrayList<>();
        isValidated = false;
        isDeleted = false;
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public List<CommentaryAlert> getCommentariesAlerts() {
        return commentariesAlerts;
    }

    public void setCommentariesAlerts(List<CommentaryAlert> commentariesAlerts) {
        this.commentariesAlerts = commentariesAlerts;
    }

    public List<IdeaAlert> getIdeasAlerts() {
        return ideasAlerts;
    }

    public void setIdeasAlerts(List<IdeaAlert> ideasAlerts) {
        this.ideasAlerts = ideasAlerts;
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void setValidated(boolean validated) {
        isValidated = validated;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString()+
                "ideas=" + ideas +
                ", commentariesAlerts=" + commentariesAlerts +
                ", ideasAlerts=" + ideasAlerts +
                ", isValidated=" + isValidated +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
