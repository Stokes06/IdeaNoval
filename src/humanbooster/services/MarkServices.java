package humanbooster.services;

import humanbooster.pojo.Grade;
import humanbooster.pojo.Mark;

public interface MarkServices {

    public abstract void addMark(int idEvaluableIdea, int idUser, Grade grade);
}
