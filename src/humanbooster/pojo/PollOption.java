package humanbooster.pojo;

public class PollOption {
    private String name;

    public PollOption(String name) {
        this.name = name;
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
