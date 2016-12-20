package eu.epitech;

/**
 * Created by samue on 20/12/2016.
 */
public class Action {

    private String  _name;
    private int     _id;

    public Action(String name, int id)
    {
        _name = name;
        _id = id;
    }

    public String getName()
    {
        return _name;
    }

    public int getId()
    {
        return _id;
    }
}
