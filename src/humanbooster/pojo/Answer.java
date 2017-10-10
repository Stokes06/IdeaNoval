package humanbooster.pojo;

public class Answer {

    private int idAnswer;
    private Poll poll;
    private User user;
    private PollOption answer;

    public Answer(Poll poll, User user, PollOption _answer) {
        this.poll = poll;
        this.user = user;
        this.answer = _answer;

    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
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

    public PollOption getAnswer() {
        return answer;
    }

    public void setAnswer(PollOption answer) {
        this.answer = answer;
    }
}
