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
        try {
            Poll poll = db.getPollList().stream()
                    .filter(e -> e.getId() == idPoll)
                    .findFirst().get();
            if(poll.getIdAuthor()==idUser) return;
            // On ajoute l'option dans le poll si elle n'existe pas déja
            poll.addOtherOption(_answer);
            PollOption optionChoisie = null;
            // On la cherche dans la liste de la BD
            if((optionChoisie = db.getOptionByName(_answer))==null)
            {
                //Si elle n'y est pas , on l'ajoute en la cherchant dans le poll
                optionChoisie = poll.getOptions().stream().filter(e->e.getName().equals(_answer)).findFirst().get();
                db.getPollOptionList().add(optionChoisie);
            }

            db.getAnswerList().add(new Answer(idPoll, idUser,optionChoisie.getIdOption()));
        } catch (NoSuchElementException e) {
            System.err.println("Ce sondage n'existe pas");
        }
    }



    @Override
    public void printAnswersByUser(int idUser) {
        StringBuilder affichage = new StringBuilder();
        affichage.append("Réponses de "+db.getUserById(idUser).getPseudo()+" :\n");
        db.getAnswerList().stream().filter(a-> a.getIdUser()==idUser)
                .forEach(answer -> {
                    affichage.append(db.getPollById(answer.getIdPoll()).getTopic()+"   ");
                    affichage.append(db.getOptionById(answer.getIdOption()).getName()+"\n");
                });
        System.out.println(affichage.toString());
    }

    @Override
    public void printAnswersScore(int idPoll) {

    }
}
