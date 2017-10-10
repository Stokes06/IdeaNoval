package humanbooster.services.impl;

import humanbooster.data.Database;
import humanbooster.pojo.User;
import humanbooster.services.UserServices;

public class UserServicesImpl implements UserServices{
    private Database db;
    public UserServicesImpl(Database _db){this.db = _db;}
    @Override
    public User connectUser(String login, String password) {

        return this.db.getUserList().stream().filter(e->e.getLogin().equals(login) && e.getPassword().equals(password)).findFirst().get();
    }
}
