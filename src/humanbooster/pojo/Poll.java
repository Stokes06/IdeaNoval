package humanbooster.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Poll extends Idea {

    /**
     * Comporte deux à cinq options plus les eventuelles options personnalisées
     */
    private List<PollOption> options;

    private Date endPoll;
    public Poll(String title, String content, int idAuthor) {
        super(title, content, idAuthor);
        options = new ArrayList<>();

    }

    /**
     * Test si l'option existe déjà et la crée dans le cas contraire
     * @param optionName
     */
    public void addOption(String optionName)
    {
        if(options.stream().filter(p->p.getName().equals(optionName)).count() == 0)
        {
            options.add(new PollOption(optionName));
        }
    }
    public List<PollOption> getOptions() {
        return options;
    }

    public void setOptions(List<PollOption> options) {
        this.options = options;
    }

    public Date getEndPoll() {
        return endPoll;
    }

    public void setEndPoll(Date endPoll) {
        this.endPoll = endPoll;
    }
}
