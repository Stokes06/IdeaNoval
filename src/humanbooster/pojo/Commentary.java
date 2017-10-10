package humanbooster.pojo;

import humanbooster.myTools.DateManager;

import java.util.Date;

public class Commentary {

    private int idCommentary;
    private int idIdea;
    private int idAuthor;
    private Date commentaryDate;
    private String content;
    private boolean isDeleted;

    public Commentary(int idIdea, int idAuthor, String content) {
        this.idIdea = idIdea;
        this.idAuthor = idAuthor;
        this.content = content;
        commentaryDate = new Date();
        isDeleted = false;
    }

    public int getIdCommentary() {
        return idCommentary;
    }

    public void setIdCommentary(int idCommentary) {
        this.idCommentary = idCommentary;
    }

    public String getContent() {
        return content;
    }

    /**
     * impossible de modifier un commentaire a posteriori
     */
    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getIdIdea() {
        return idIdea;
    }

    public void setIdIdea(int idIdea) {
        this.idIdea = idIdea;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public Date getCommentaryDate() {
        return commentaryDate;
    }

    public void setCommentaryDate(Date commentaryDate) {
        this.commentaryDate = commentaryDate;
    }

    @Override
    public String toString() {
        return "Commentary{" +
                "idea=" + idIdea +
                ", id author=" + idAuthor +
                ", commentaryDate=" + DateManager.formatDate(commentaryDate )+
                ", content='" + content + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
