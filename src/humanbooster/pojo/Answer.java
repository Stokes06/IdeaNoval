package humanbooster.pojo;

public class Answer {

    private int idPoll;
    private int idUser;
    private int idOption;

    public Answer(int idPoll, int idUser, int idOption) {
        this.idPoll = idPoll;
        this.idUser = idUser;
        this.idOption = idOption;

    }


    public int getIdPoll() {
        return idPoll;
    }

    public void setIdPoll(int poll) {
        this.idPoll = poll;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int user) {
        this.idUser = user;
    }

    public int getIdOption() {
        return idOption;
    }

    public void setIdOption(int idOption) {
        this.idOption = idOption;
    }
}
