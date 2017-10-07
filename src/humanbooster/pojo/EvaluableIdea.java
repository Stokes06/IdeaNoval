package humanbooster.pojo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class EvaluableIdea extends Idea {
    private Date endEvaluation;
    private List<Mark> marks;

    public EvaluableIdea(String title, String content, Client author) {
        super(title, content, author);
        Calendar c = Calendar.getInstance();
        c.setTime(this.getPublishDate());
        c.add(Calendar.DAY_OF_WEEK,7);
        this.endEvaluation = c.getTime();
        marks = new ArrayList<>();
    }

    public Date getEndEvaluation() {
        return endEvaluation;
    }

    public void setEndEvaluation(Date endEvaluation) {
        this.endEvaluation = endEvaluation;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void addMark(Mark mark){
        this.marks.add(mark);
    }
    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+getUpAndFlop();
    }
    private String getUpAndFlop()
    {
        StringBuilder ret = new StringBuilder();
        long numberOfTop = this.getMarks().stream().filter(e->e.getGrade().equals(Grade.TOP)).count();
        long numberOfFlop = this.getMarks().stream().filter(e->e.getGrade().equals(Grade.FLOP)).count();
        ret.append("top :"+numberOfTop+", flop : "+numberOfFlop);
        return ret.toString();
    }
}
