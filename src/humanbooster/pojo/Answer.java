package humanbooster.pojo;

public class Answer {

    private Poll poll;
    private User user;
    private String answer;

    public Answer(Poll poll, User user, String answer) {
        this.poll = poll;
        this.user = user;
        this.answer = answer;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
