package humanbooster.pojo;

import java.util.Date;

public class IdeaAlert {
    private int idIdea;
    private String reason;
    private Date dateAlert;
    private int idAuthor;

    public IdeaAlert(int idea, String reason, int author) {
        this.idIdea = idea;
        this.reason = reason;
        this.idAuthor = author;
        this.dateAlert = new Date();
    }

    @Override
    public String toString() {
        return "IdeaAlert{" +
                "idIdea=" + idIdea +
                ", reason='" + reason + '\'' +
                ", dateAlert=" + dateAlert +
                ", idAuthor=" + idAuthor +
                '}';
    }

    public int getIdIdea() {
        return idIdea;
    }

    public void setIdIdea(int idIdea) {
        this.idIdea = idIdea;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDateAlert() {
        return dateAlert;
    }

    public void setDateAlert(Date dateAlert) {
        this.dateAlert = dateAlert;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }
}
