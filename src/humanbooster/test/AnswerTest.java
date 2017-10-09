package humanbooster.test;

import humanbooster.data.Database;
import humanbooster.pojo.Client;
import humanbooster.pojo.Poll;
import humanbooster.services.impl.AnswerServicesImpl;

public class AnswerTest {
    public static void main(String[] args) {
        Database db = new Database();
        AnswerServicesImpl answerServices = new AnswerServicesImpl(db);
        Client cli = new Client("clientest","admin","admin");
        Poll poll = db.getPolls().get(0);
        answerServices.addAnswer(poll,cli,"pas grand chose");
        System.out.println(poll.getOptions());
        answerServices.addAnswer(poll,cli,"rien");
        System.out.println(poll.getOptions());
        answerServices.addAnswer(poll,cli,"rien");
        System.out.println(poll.getOptions());
        answerServices.printAnswersScore(poll);
    }
}
