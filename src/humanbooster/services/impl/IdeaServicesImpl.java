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
        return this.db.getIdeas().stream().filter(e->e.getClass().equals(EvaluableIdea.class)).collect(Collectors.toList());
    }

    @Override
    public void printAllEvaluableIdeas() {
        this.db.getIdeas().stream().filter(idea->idea.getClass().equals(EvaluableIdea.class)).forEach(System.out::println);
    }




}
