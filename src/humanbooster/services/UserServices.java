package humanbooster.services;

import humanbooster.pojo.User;

public interface UserServices {

    public abstract User connectUser(String login, String password);
}
