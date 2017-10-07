package humanbooster.pojo;

public class Mark {

    private EvaluableIdea idea;
    private User user;
    /**
     * top = 1 , flop = -1
     */
    private Grade grade;

    public Mark(EvaluableIdea idea, User user, Grade grade) {
        this.idea = idea;
        this.user = user;
        this.grade = grade;
    }

    public EvaluableIdea getIdea() {
        return idea;
    }

    public void setIdea(EvaluableIdea idea) {
        this.idea = idea;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
