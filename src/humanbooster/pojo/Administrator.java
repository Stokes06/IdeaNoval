package humanbooster.pojo;

public class Administrator extends User {

    public Administrator(String _pseudo, String _login, String _password)
    {
        super(_pseudo, _login, _password);
    }

    @Override
    public String toString() {
        return "Administrator{}"+super.toString();
    }
}
