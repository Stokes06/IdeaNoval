package humanbooster.data;

import humanbooster.pojo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    private List<User> users;
    private List<EvaluableIdea> evaluableIdeas;
    private List<Poll> polls;

    public Database(){

        evaluableIdeas = new ArrayList<>();
        users = Arrays.asList(new Administrator("AdminChef","admin@ideaNoval.com","dazdko"),new Client("Guillaume","gm","0167"),new Client("Marie-Estelle","met@hotmail.fr","mouelline"));
        evaluableIdeas.add(new EvaluableIdea("idée du siècle","cliquez sur le lien pour la voir",new Client("arnaqueur","dadzdz","25515")));
        evaluableIdeas.add(new EvaluableIdea("idée du jour","me raser la barbe avant qu'il ne soit trop tard",new Client("le nul","dadead","ezfreg")));

        generatePoll();
    }

    private void generatePoll()
    {
        polls = new ArrayList<>();
        Poll poll = new Poll("Sondage de la semaine","que pensez vous de ... ?",new Client("inconnu","login","mdp"));
        poll.addOption("oui");
        poll.addOption("non");
        polls.add(poll);
    }
    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls) {
        this.polls = polls;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<EvaluableIdea> getEvaluableIdeas() {
        return evaluableIdeas;
    }

    public void setEvaluableIdeas(List<EvaluableIdea> evaluableIdeas) {
        this.evaluableIdeas = evaluableIdeas;
    }
}
