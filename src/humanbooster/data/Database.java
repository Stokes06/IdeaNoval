package humanbooster.data;

import humanbooster.pojo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Database {
    private List<User> userList;
    private List<EvaluableIdea> evaluableIdeasList;
    private List<Poll> pollList;
    private List<Mark> markList;
    private List<Answer> answerList;
    private List<PollOption> pollOptionList;
    public Database(){
        userList = new ArrayList<>();
        evaluableIdeasList = new ArrayList<>();
        pollList = new ArrayList<>();
        markList = new ArrayList<>();
        answerList = new ArrayList<>();
        pollOptionList = new ArrayList<>();
        userList.add(new Administrator("AdminChef","admin@ideaNoval.com","dazdko"));
        userList.add(new Client("Guillaume","gm","0"));
        userList.add(new Client("Marie-Estelle","met@hotmail.fr","mouelline"));
        userList.add(new Client("Jack","jack@hb.com","lepzaozafk"));
        evaluableIdeasList.add(new EvaluableIdea("idée du siècle","cliquez sur le lien pour la voir",userList.get(0).getIdUser()));
        evaluableIdeasList.add(new EvaluableIdea("idée du jour","J'aimerais avoir une bnnne idée pour pouvoir poster sur ce site ",userList.get(3).getIdUser()));

        generatePoll();
    }

    private void generatePoll()
    {
        pollList = new ArrayList<>();
        Poll p1 = new Poll("Sondage de la semaine","la nourriture... ?",userList.get(1).getIdUser());
        p1.setTopic("boulangerie ou super U ?");
        p1.addOption("boulangerie");
        p1.addOption("U");
        pollList.add(p1);
        this.addOptionsInList(p1.getOptions());
        Poll p2 = new Poll("Sondage de la matinée","la pause à 10h30",userList.get(2).getIdUser());
        p2.setTopic("Qu'en pensez vous ?");
        p2.addOption("trop courte");
        p2.addOption("trop tôt");
        this.addOptionsInList(p2.getOptions());
        pollList.add(p2);
    }

    private void addOptionsInList(List<PollOption> options) {
        for (PollOption option : options) {
            if(!pollOptionList.contains(option)) pollOptionList.add(option);
        }
    }

    public User getUserById(int idUser) {
        return this.getUserList().stream()
                .filter(e->e.getIdUser()==idUser)
                .findFirst().get();

    }
    public Poll getPollById(int idPoll)
    {
        Poll ret = null;
        try{

            ret =  getPollList().stream().filter(poll->poll.getId()==idPoll).findFirst().get();

        }catch (NoSuchElementException e)
        {
            System.out.println("Le poll avec l'id "+idPoll+" n'existe pas");
        }finally {
            return ret;
        }

    }
    public Answer getAnswerByIds(int idUser, int idPoll)
    {
        Answer ret = null;

        try{

            ret =  getAnswerList().stream().filter(answer->answer.getIdUser()==idUser && answer.getIdPoll()==idPoll).findFirst().get();
            return ret;
        }catch (NoSuchElementException e)
        {
            System.out.println("La réponse cherchée n'existe pas");
        }

        return null;
    }
    public PollOption getOptionByName(String name)
    {
        try{

            return this.getPollOptionList().stream().filter(e->e.getName().equals(name)).findFirst().get();

        }catch (NoSuchElementException e)
        {
            System.out.println("cette option n'existe pas");
            return null;
        }
    }
    public List<PollOption> getOptionsByIdPoll(int idPoll)
    {
        return this.getPollList().stream().filter(poll->poll.getId()==idPoll)
                .findFirst().get()
                .getOptions();
    }
    public PollOption getOptionById(int idOption)
    {
        PollOption ret = null;
        try{

            ret =  getPollOptionList().stream().filter(e->e.getIdOption()==idOption).findFirst().get();

        }catch (NoSuchElementException e)
        {
            System.err.println("La réponse cherchée n'existe pas");
        }finally {
            return ret;
        }

    }
    public List<EvaluableIdea> getEvaluableIdeasList() {
        return evaluableIdeasList;
    }

    public void setEvaluableIdeasList(List<EvaluableIdea> evaluableIdeasList) {
        this.evaluableIdeasList = evaluableIdeasList;
    }

    public List<PollOption> getPollOptionList() {
        return pollOptionList;
    }

    public void setPollOptionList(List<PollOption> pollOptionList) {
        this.pollOptionList = pollOptionList;
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


    public EvaluableIdea getEvaluateIdeaById(int choix) {
        try{
            return this.getEvaluableIdeas().stream().filter(e->e.getId()==choix).findFirst().get();
        }catch(NoSuchElementException e)
        {
            System.out.println("le choix de cette idée n'est pas disponible");
            return null;
        }
    }

}
