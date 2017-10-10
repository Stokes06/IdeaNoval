package humanbooster.test;

import humanbooster.data.Database;
import humanbooster.pojo.Client;
import humanbooster.pojo.Poll;
import humanbooster.pojo.PollOption;
import humanbooster.pojo.User;
import humanbooster.services.impl.AnswerServicesImpl;

public class AnswerTest {
    public static void main(String[] args) {
        Database db = new Database();
        AnswerServicesImpl answerServices = new AnswerServicesImpl(db);

        answerServices.addAnswer(db.getPollList().get(0).getId(), db.getUserList().get(1).getIdUser(),"oui");
        answerServices.addAnswer(db.getPollList().get(1).getId(), db.getUserList().get(1).getIdUser(),"oui");

        answerServices.printAnswersByUser(1);
    }
}
