package humanbooster.pojo;

public class PollOption {
    private int idOption;
    private String name;

    public PollOption(String name) {
        this.name = name;
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
