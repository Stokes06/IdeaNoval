package humanbooster.pojo;

import humanbooster.myTools.DateManager;

import java.util.Date;

public class Commentary {

    private int idCommentary;
    private Idea idea;
    private User author;
    private Date commentaryDate;
    private String content;
    private boolean isDeleted;

    public Commentary(Idea idea, User author, String content) {
        this.idea = idea;
        this.author = author;
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

    public Idea getIdea() {

        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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
                "idea=" + idea +
                ", author=" + author +
                ", commentaryDate=" + DateManager.formatDate(commentaryDate )+
                ", content='" + content + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
