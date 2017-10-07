package humanbooster.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Poll extends Idea {

    /**
     * Comporte deux à cinq options plus les eventuelles options personnalisées
     */
    private List<PollOption> options;
    private List<Answer> answers;
    private Date endPoll;
    public Poll(String title, String content, Client author) {
        super(title, content, author);
        options = new ArrayList<>();
        answers = new ArrayList<>();
    }

    public List<PollOption> getOptions() {
        return options;
    }

    public void setOptions(List<PollOption> options) {
        this.options = options;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Date getEndPoll() {
        return endPoll;
    }

    public void setEndPoll(Date endPoll) {
        this.endPoll = endPoll;
    }
}
