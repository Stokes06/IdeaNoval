package humanbooster.data.impl;

import humanbooster.data.Database;
import humanbooster.data.DatabaseService;

public class DatabaseServiceImpl implements DatabaseService{
    private Database db;

    public DatabaseServiceImpl(Database db) {
        this.db = db;
    }


}
