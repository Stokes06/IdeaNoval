package humanbooster.services;

import humanbooster.pojo.Idea;

import java.util.List;

public interface IdeaServices {
    public List<Idea> getAllEvaluableIdeas();
    public void printAllEvaluableIdeas();

    public void printAllPolls();
}
