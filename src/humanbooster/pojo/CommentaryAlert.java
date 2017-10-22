package humanbooster.pojo;

public class CommentaryAlert {

    private int idCommentary;
    private int idAuthor;
    private String reason;
    private String dateAlert;

    public CommentaryAlert(int idCommentary, int idAuthor, String reason, String dateAlert) {
        this.idCommentary = idCommentary;
        this.idAuthor = idAuthor;
        this.reason = reason;
        this.dateAlert = dateAlert;
    }

    public int getIdCommentary() {
        return idCommentary;
    }

    public void setIdCommentary(int idCommentary) {
        this.idCommentary = idCommentary;
    }

    public int getAuthor() {
        return idAuthor;
    }

    public void setAuthor(int author) {
        this.idAuthor = author;
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

    @Override
    public String toString() {
        return "CommentaryAlert{" +
                "idCommentary=" + idCommentary +
                ", idAuthor=" + idAuthor +
                ", reason='" + reason + '\'' +
                ", dateAlert='" + dateAlert + '\'' +
                '}';
    }
}
