package humanbooster.pojo;

public class PollOption {
    private static int optionCount = 0;
    private int idOption;
    private String name;
    private boolean isOtherAnswer;
    public PollOption(String name) {

        this.name = name;
        this.idOption = optionCount++;
        this.isOtherAnswer = false;
    }

    public boolean isOtherAnswer() {
        return isOtherAnswer;
    }

    public void setOtherAnswer(boolean otherAnswer) {
        isOtherAnswer = otherAnswer;
    }

    public int getIdOption() {
        return idOption;
    }

    public void setIdOption(int idOption) {
        this.idOption = idOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PollOption{" +
                "name='" + name + '\'' +
                '}';
    }
}
