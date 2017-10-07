package humanbooster.pojo;

import java.util.Date;

public class IdeaAlert {
    private Idea idea;
    private String reason;
    private Date dateAlert;
    private Client author;

    public IdeaAlert(Idea idea, String reason, Client author) {
        this.idea = idea;
        this.reason = reason;
        this.author = author;
        this.dateAlert = new Date();
    }
}
