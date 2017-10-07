package humanbooster.pojo;

public class CommentaryAlert {

    private Commentary commentary;
    private Client author;
    private String reason;
    private String dateAlert;

    public CommentaryAlert(Commentary commentary, Client author, String reason, String dateAlert) {
        this.commentary = commentary;
        this.author = author;
        this.reason = reason;
        this.dateAlert = dateAlert;
    }

    public Commentary getCommentary() {
        return commentary;
    }

    public void setCommentary(Commentary commentary) {
        this.commentary = commentary;
    }

    public Client getAuthor() {
        return author;
    }

    public void setAuthor(Client author) {
        this.author = author;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDateAlert() {
        return dateAlert;
    }

    public void setDateAlert(String dateAlert) {
        this.dateAlert = dateAlert;
    }
}
