package humanbooster.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Poll extends Idea {

    /**
     * Comporte deux à cinq options plus les eventuelles options personnalisées
     */
    private List<PollOption> options;
    private String topic;
    private Date endPoll;
    public Poll(String title, String content, int idAuthor) {
        super(title, content, idAuthor);
        options = new ArrayList<>();

    }

    /**
     * Test si l'option existe déjà et la crée dans le cas contraire
     * @param optionName
     */
    public boolean addOption(String optionName)
    {
        if(options.stream().filter(p->p.getName().equals(optionName)).count() == 0)
        {
            options.add(new PollOption(optionName));
            return true;
        }
        return false;
    }

    public PollOption addOtherOption(String optionName)
    {
        if(options.stream().filter(p->p.getName().equals(optionName)).count() == 0)
        {
            PollOption option = new PollOption(optionName);
            option.setOtherAnswer(true);
            options.add(option);
            return option;
        }
        return null;
    }

    public String getPublicOptions()
    {
        StringBuilder ret = new StringBuilder();
        this.getOptions().stream().forEach(o->{
           if(!o.isOtherAnswer()) ret.append("["+o.getIdOption()+"]"+o.getName()+"\n");
        });
        return ret.toString();
    }
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
