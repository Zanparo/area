package eu.epitech;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mimoone on 22/12/2016.
 */
public abstract class           ALinker implements ILinker
{
    String                      _name;
    ArrayList<AAction>          _actions;
    ArrayList<AAction>          _reactions;

    ALinker()
    {
        _name = "";
        _actions = new ArrayList<AAction>();
        _reactions = new ArrayList<AAction>();
    }

    public void                 setName(String name)
    {
        _name = name;
        return;
    }

    public String               getName()
    {
        return (_name);
    }

    public void                 addAction(AAction action)
    {
        _actions.add(action);
        return;
    }

    public void                 addReaction(AAction reaction)
    {
        _reactions.add(reaction);
        return;
    }

    public void                 addActions(List<AAction> actions)
    {
        for (AAction ac: actions)
        {
            _actions.add(ac);
        }
        return;
    }

    public void                 addReaction(List<AAction> reactions)
    {
        for (AAction ac: reactions)
        {
            _reactions.add(ac);
        }
        return;
    }

    public AAction              getAction(int index)
    {
        return(_actions.get(index));
    }

    public AAction              getReaction(int index)
    {
        return(_reactions.get(index));
    }

    public ArrayList<AAction>   getActions()
    {
        return (_actions);
    }

    public ArrayList<AAction>   getReactions()
    {
        return(_reactions);
    }
}
