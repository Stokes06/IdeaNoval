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
        System.out.println("Choisissez l'idée que pour laquelle vous voulez donner une note");
        List<Idea> ideas = ideaServices.getAllEvaluableIdeas();
        Iterator<Integer> it = IntStream.range(0,ideas.size()).iterator();
        ideas.stream().map(idea -> idea.getTitle()).forEach(i->{System.out.println(it.next()+1+") "+i);});
        EvaluableIdea idea = (EvaluableIdea) db.getEvaluableIdeas().get(sc.nextInt()-1);

        System.out.println(idea.getContent());
        System.out.println("tapez 1 si vous aimez , 0 si vous n'aimez pas");
        Grade value = sc.nextInt()>0 ? Grade.TOP : Grade.FLOP;
        markServices.addMark(idea, session, value);
        ideaServices.printAllEvaluableIdeas();

        Poll pollTemp = new Poll("titre","contenu",(Client)session);
        answerServices.addAnswer(pollTemp,session,"oui");
        answerServices.addAnswer(pollTemp,session,"non");
        answerServices.addAnswer(pollTemp,session,"peut-etre");
        answerServices.addAnswer(pollTemp,session,"peut-etre");
        answerServices.addAnswer(pollTemp,session,"oui");
        System.out.println(pollTemp.getOptions());

    }
}
