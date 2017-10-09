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
    public void addAnswer(Poll poll, User user, String _answer ) {
        /**
         * On cherche si la réponse est disponible parmis les PollOption
         */
        PollOption option = null;
   try{
        option = poll.getOptions().stream()
               .filter(pollOption->pollOption.getName().equals(_answer))
               .findFirst().get();
   }catch (NoSuchElementException e)
   {
       //Rien a faire ici, c'est juste qu'on ne l'a pas trouvé
   }
        // Si on ne la trouve pas, on crée l'option et on l'ajoute a la liste du Poll
        if(option == null)
        {
            option = new PollOption(_answer);
            poll.getOptions().add(option);
        }

     // On crée la réponse à envoyer
        Answer answer = new Answer(poll, user, option);
        // on ajoute la réponse au poll
       poll.getAnswers().add(answer);

        //on ajoute la réponse à l'utilisateur
        user.getAnswers().add(answer);
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
