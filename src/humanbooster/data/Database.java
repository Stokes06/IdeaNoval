package humanbooster.data;

import humanbooster.pojo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    private List<User> userList;
    private List<EvaluableIdea> evaluableIdeasList;
    private List<Poll> pollList;
    private List<Mark> markList;
    private List<Answer> answerList;
    public Database(){
        userList = new ArrayList<>();
        evaluableIdeasList = new ArrayList<>();
        pollList = new ArrayList<>();
        markList = new ArrayList<>();
        answerList = new ArrayList<>();
        userList.add(new Administrator("AdminChef","admin@ideaNoval.com","dazdko"));
        userList.add(new Client("Guillaume","gm","0"));
        userList.add(new Client("Marie-Estelle","met@hotmail.fr","mouelline"));
        userList.add(new Client("Jack","jack@hb.com","lepzaozafk"));
        evaluableIdeasList.add(new EvaluableIdea("idée du siècle","cliquez sur le lien pour la voir",userList.get(0).getIdUser()));
        evaluableIdeasList.add(new EvaluableIdea("idée du jour"," ",userList.get(1).getIdUser()));

        generatePoll();
    }

    private void generatePoll()
    {
        pollList = new ArrayList<>();
        Poll poll = new Poll("Sondage de la semaine","que pensez vous de ... ?",userList.get(3).getIdUser());
        poll.addOption("oui");
        poll.addOption("non");
        pollList.add(poll);
    }

    public List<EvaluableIdea> getEvaluableIdeasList() {
        return evaluableIdeasList;
    }

    public void setEvaluableIdeasList(List<EvaluableIdea> evaluableIdeasList) {
        this.evaluableIdeasList = evaluableIdeasList;
    }

    public List<Mark> getMarkList() {
        return markList;
    }

    public void setMarkList(List<Mark> markList) {
        this.markList = markList;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public List<Poll> getPollList() {
        return pollList;
    }

    public void setPollList(List<Poll> pollList) {
        this.pollList = pollList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<EvaluableIdea> getEvaluableIdeas() {
        return evaluableIdeasList;
    }

    public void setEvaluableIdeas(List<EvaluableIdea> evaluableIdeas) {
        this.evaluableIdeasList = evaluableIdeas;
    }

    public void addMark(Mark mark) {
        this.getMarkList().add(mark);
    }

    public void addAnswer(Answer answer) {
        this.getAnswerList().add(answer);
    }
}
