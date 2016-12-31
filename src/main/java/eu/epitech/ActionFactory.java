package eu.epitech;

/**
 * Created by samue on 20/12/2016.
 */
public class ActionFactory {

    private int _id = 0;
    private static ActionFactory _instance = new ActionFactory();

    private ActionFactory()
    {
    }

    public Action createAction(String name)
    {
        return new Action(name, _id++);
    }

    public Reaction createReaction(String name)
    {
        return new Reaction(name, _id++);
    }

    public static ActionFactory getInstance()
    {
        return _instance;
    }
}
