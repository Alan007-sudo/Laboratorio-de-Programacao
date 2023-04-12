package dao;

import java.util.List;

public abstract class Dao_abstract {

    public abstract void insert(Object object);

    public abstract void delete(Object object);

    public abstract void update(Object object);

    public abstract Object list(int id);

    public abstract List listAll();

}
