package humanbooster.pojo;

public class Mark {

    private int idMark;
    private int idIdea;
    private int idUser;
    /**
     * top = 1 , flop = -1
     */
    private Grade grade;

    public Mark(int idIdea, int idUser, Grade grade) {
        this.idIdea = idIdea;
        this.idUser = idUser;
        this.grade = grade;
    }

    public int getIdMark() {
        return idMark;
    }

    public void setIdMark(int idMark) {
        this.idMark = idMark;
    }

    public int getIdea() {
        return idIdea;
    }

    public void setIdea(int idea) {
        this.idIdea = idea;
    }

    public int getUser() {
        return idUser;
    }

    public void setUser(int user) {
        this.idUser = user;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id Idea=" + idIdea +
                ", idUser=" + idUser +
                ", grade=" + grade +
                '}';
    }
}
