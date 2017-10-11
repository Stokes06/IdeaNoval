package humanbooster.services.impl;

import humanbooster.data.Database;
import humanbooster.pojo.EvaluableIdea;
import humanbooster.pojo.Grade;
import humanbooster.pojo.Mark;
import humanbooster.services.MarkServices;

public class MarkServicesImpl implements MarkServices {

    Database db;
    public MarkServicesImpl(Database _db) {this.db = _db;}
    @Override
    public void addMark(int idEvaluableIdea, int idUser, String advice) {
        Grade grade = (advice.matches("TOP|top|oui|yes|o|O|OUI"))? Grade.TOP : Grade.FLOP;

        // On cherche l'idée correspondante à l'id passé en paramètre
       EvaluableIdea ideaToMark = db.getEvaluableIdeas().stream().filter(idea -> idea.getId() == idEvaluableIdea).findFirst().get();
        // Si l'utilisateur est le créateur de l'idée , il ne vote pas
      if(ideaToMark.getIdAuthor() == idUser) return;
      //sinon on ajoute le vote dans la base de données
       Mark mark = new Mark(idEvaluableIdea, idUser, grade);
       db.addMark(mark);
    }

    @Override
    public String getMarksForIdea(int idEvaluableIdea) {
        StringBuilder str = new StringBuilder();
       long numberTop =  this.db.getMarkList().stream().filter(e->e.getIdIdea()==idEvaluableIdea)
                .filter(e->e.getGrade()==Grade.TOP).count();
        long numberFlop =  this.db.getMarkList().stream().filter(e->e.getIdIdea()==idEvaluableIdea)
                .filter(e->e.getGrade()==Grade.FLOP).count();
        str.append(numberTop+"↑ - ");
        str.append(numberFlop+"↓");
        return str.toString();
    }
}
