package humanbooster.pojo;


import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private boolean isValidated;
    private boolean isDeleted;

    public Client(String _pseudo, String _login, String _password)
    {
        super(_pseudo,_login, _password);

        isValidated = false;
        isDeleted = false;
    }


    public boolean isValidated() {
        return isValidated;
    }

    public void setValidated(boolean validated) {
        isValidated = validated;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString()+

                ", commentariesAlerts=" +
                ", ideasAlerts=" +
                ", isValidated=" + isValidated +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
