package humanbooster.data;

import humanbooster.pojo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    private List<User> users;
    private List<Idea> ideas;


    public Database(){

        ideas = new ArrayList<>();
        users = Arrays.asList(new Administrator("AdminChef","admin@ideaNoval.com","dazdko"),new Client("Guillaume","gm","0167"),new Client("Marie-Estelle","met@hotmail.fr","mouelline"));
        ideas.add(new EvaluableIdea("idée du siècle","cliquez sur le lien pour la voir",new Client("arnaqueur","dadzdz","25515")));
        ideas.add(new EvaluableIdea("idée du jour","me raser la barbe avant qu'il ne soit trop tard",new Client("le nul","dadead","ezfreg")));
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }
}
