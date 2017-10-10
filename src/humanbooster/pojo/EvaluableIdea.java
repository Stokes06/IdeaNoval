package humanbooster.pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EvaluableIdea extends Idea {
    private Date endEvaluation;


    public EvaluableIdea(String title, String content, Client author) {
        super(title, content, author);
        Calendar c = Calendar.getInstance();
        c.setTime(this.getPublishDate());
        c.add(Calendar.DAY_OF_WEEK,7);
        this.endEvaluation = c.getTime();

    }

    public Date getEndEvaluation() {
        return endEvaluation;
    }

    public void setEndEvaluation(Date endEvaluation) {
        this.endEvaluation = endEvaluation;
    }



    @Override
    public String toString() {
        return "evaluable idea : "+super.toString();
    }

}
