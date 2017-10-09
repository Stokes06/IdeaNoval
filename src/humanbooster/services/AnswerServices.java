package humanbooster.services;

import humanbooster.pojo.Answer;
import humanbooster.pojo.Poll;
import humanbooster.pojo.User;

public interface AnswerServices {
    public abstract void addAnswer(Poll poll, User user, String answer);
    public abstract void printAnswersByClient(Poll poll);
    public abstract void printAnswersScore(Poll poll);
}
