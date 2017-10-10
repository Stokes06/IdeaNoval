package humanbooster.services.impl;

import humanbooster.data.Database;
import humanbooster.pojo.EvaluableIdea;
import humanbooster.pojo.Idea;
import humanbooster.services.IdeaServices;

import java.util.List;
import java.util.stream.Collectors;

public class IdeaServicesImpl implements IdeaServices {
    private Database db;
    public IdeaServicesImpl(Database _db){this.db = _db;}
    @Override
    public List<Idea> getAllEvaluableIdeas() {
        return this.db.getEvaluableIdeas().stream().filter(e->e.getClass().equals(EvaluableIdea.class)).collect(Collectors.toList());
    }

    /**
     * affiche l'identifiant et le titre des idées
     */
    @Override
    public void printAllEvaluableIdeas() {
        this.db.getEvaluableIdeas().stream()
                .forEach(e->{
                    System.out.println("["+e.getId()+"] "+e.getTitle());
                });
    }

    @Override
    public void printAllPolls() {
        this.db.getPollList().stream()
                .forEach(e->{
                    System.out.println("["+e.getId()+"] "+e.getTitle());
                });
    }


}
