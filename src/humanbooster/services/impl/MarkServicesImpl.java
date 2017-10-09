package humanbooster.services.impl;

import humanbooster.data.Database;
import humanbooster.pojo.EvaluableIdea;
import humanbooster.pojo.Mark;
import humanbooster.services.MarkServices;

public class MarkServicesImpl implements MarkServices {

    Database db;
    public MarkServicesImpl(Database _db) {this.db = _db;}
    @Override
    public void addMark(Mark mark) {
       EvaluableIdea ideaToMark = db.getEvaluableIdeas().stream().map(idea -> (EvaluableIdea)idea).filter(idea -> idea == mark.getIdea()).findFirst().get();
       ideaToMark.addMark(mark);
       mark.getUser().getMarks().add(mark);
    }
}
