package humanbooster.data;

import humanbooster.pojo.*;

import java.util.List;

public interface DatabaseService {

    public User getUserById(int idUser);
    public EvaluableIdea getEvaluateIdeaById(int choix);
    public Poll getPollById(int idPoll);
    public Answer getAnswerByIds(int idUser, int idPoll);
    public PollOption getOptionById(int idOption);
    public PollOption getOptionByName(String name);
    public List<PollOption> getOptionsByIdPoll(int idPoll);
}
