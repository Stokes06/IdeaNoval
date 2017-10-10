package humanbooster.test;

import humanbooster.data.Database;
import humanbooster.pojo.*;
import humanbooster.services.IdeaServices;
import humanbooster.services.MarkServices;
import humanbooster.services.UserServices;
import humanbooster.services.impl.AnswerServicesImpl;
import humanbooster.services.impl.IdeaServicesImpl;
import humanbooster.services.impl.MarkServicesImpl;
import humanbooster.services.impl.UserServicesImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ConnectionTest {
    public static void main(String[] args) {

        Database db = new Database();
        UserServices userServices = new UserServicesImpl(db);
        IdeaServices ideaServices = new IdeaServicesImpl(db);
        MarkServices markServices = new MarkServicesImpl(db);
        AnswerServicesImpl answerServices = new AnswerServicesImpl(db);
        Scanner sc = new Scanner(System.in);
        String login, password;
        User session;


     do{
         System.out.println("Entrez votre login (email)");
         login = sc.next();
         System.out.println("Entrez votre mot de passe");
         password = sc.next();

     }while((session = userServices.connectUser(login,password)) == null);


        System.out.println("Bienvenue "+session.getPseudo());
        System.out.println("Choisissez l'idée  pour laquelle vous voulez donner une note");

        ideaServices.printAllPolls();

        int choix = sc.nextInt();
        Poll ideaChoix = db.getPollById(choix);
        System.out.println(ideaChoix.getContent());
        System.out.println(ideaChoix.getTopic());
        System.out.println(ideaChoix.getPublicOptions());
        System.out.println("Quelle est votre reponse ?");
        String choixPoll = sc.next();
        answerServices.addAnswer(ideaChoix.getId(), session.getIdUser(),choixPoll);
        answerServices.printAnswersByUser(session.getIdUser());
        System.out.println("réponses possible après :");
        System.out.println(ideaChoix.getPublicOptions());

        System.out.println("Choisissez une idée evaluable : ");
        ideaServices.printAllEvaluableIdeas();
        choix = sc.nextInt();
        EvaluableIdea ideaVote = db.getEvaluateIdeaById(choix);
        System.out.println(ideaVote.getContent());
        System.out.println("Aimez vous cette idée ? (y/n)");
        Grade g = (sc.next().matches("y|oui]"))? Grade.TOP : Grade.FLOP;

        markServices.addMark(ideaVote.getId(), session.getIdUser(), g);
        markServices.addMark(ideaVote.getId(), db.getUserList().get(0).getIdUser(), Grade.TOP);
        markServices.addMark(ideaVote.getId(), db.getUserList().get(2).getIdUser(), Grade.FLOP);

        System.out.println(ideaVote.getTitle()+" Evaluation :");
        System.out.println(markServices.getMarksForIdea(ideaVote.getId()));
    }
}
