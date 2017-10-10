package humanbooster.pojo;

import humanbooster.myTools.DateManager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Idea {

    private int idIdea;
    private String title;
    private String content;
    private Date publishDate;
    private Client author;
    private String picture;
    private Category category;
    private boolean isDeleted;
    public Idea(String title, String content, Client author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishDate = new Date();
        isDeleted = false;
    }

    public int getIdIdea() {
        return idIdea;
    }

    public void setIdIdea(int idIdea) {
        this.idIdea = idIdea;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Client getAuthor() {
        return author;
    }

    public void setAuthor(Client author) {
        this.author = author;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishDate=" + DateManager.formatDate(publishDate) +
                ", author=" + author +
                ", category=" + category +
                '}';
    }
}
