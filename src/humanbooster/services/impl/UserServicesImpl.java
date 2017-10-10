package humanbooster.services.impl;

import humanbooster.data.Database;
import humanbooster.pojo.User;
import humanbooster.services.UserServices;

import java.util.NoSuchElementException;

public class UserServicesImpl implements UserServices{
    private Database db;
    public UserServicesImpl(Database _db){this.db = _db;}
    @Override
    public User connectUser(String login, String password) {

        try{
           return this.db.getUserList().stream().filter(e->e.getLogin().equals(login) && e.getPassword().equals(password)).findFirst().get();
        }catch (NoSuchElementException e)
        {
            System.out.println("utilisateur introuvable");
            return null;
        }
    }
}
