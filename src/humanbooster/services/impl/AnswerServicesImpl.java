package humanbooster.services.impl;

import humanbooster.data.Database;
import humanbooster.pojo.Answer;
import humanbooster.pojo.Poll;
import humanbooster.pojo.PollOption;
import humanbooster.pojo.User;
import humanbooster.services.AnswerServices;

import java.util.NoSuchElementException;

public class AnswerServicesImpl implements AnswerServices {
  private Database db;
    public AnswerServicesImpl(Database _db){this.db = _db;}
    @Override
    public void addAnswer(int idPoll, int idUser, String _answer ) {
        /**
         * On cherche si la réponse est disponible parmis les PollOption
         */
        int idOption;
   try{
        idOption = db.getAnswerList().stream()
                .map(answer -> answer.getIdPoll())
               .filter(id-> id==idPoll)
               .findFirst().get();
   }catch (NoSuchElementException e)
   {
       // Si on ne la trouve pas, on crée l'option et on l'ajoute a la liste du Poll
       idOption = new PollOption(_answer);
       poll.getOptions().add(option);
   }



     // On crée la réponse à envoyer
        Answer answer = new Answer(poll, user, option);
   db.addAnswer(answer);



    }

    @Override
    public void printAnswersByClient(Poll poll) {
        StringBuilder affichage = new StringBuilder();
        poll.getAnswers().stream()
                .forEach(e->{
                    affichage.append("reponse de "+e.getUser().getPseudo()+" : "+e.getAnswer().getName()+"\n");
                });
        System.out.println(affichage.toString());
    }

    @Override
    public void printAnswersScore(Poll poll) {
        StringBuilder affichage = new StringBuilder();

        for(PollOption pollOption : poll.getOptions())
        {
            long numberOfVote = poll.getAnswers().stream()
                    .filter(e->e.getAnswer().getName().equals(pollOption.getName()))
                    .count();
            affichage.append(pollOption.getName()+" : "+numberOfVote+"\n");
        }
        System.out.println(affichage);
    }
}
