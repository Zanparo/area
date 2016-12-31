package eu.epitech;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mimoone on 20/12/2016.
 */
public abstract class           AAction implements IAction
{
    private String              _name;
    private ArrayList<String>   _actions;
    private boolean             _isActionAviable;

    AAction()
    {
        _name = "";
        _actions = new ArrayList<String>();
        _isActionAviable = false;
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

    public boolean              isActionAviable()
    {
        return (_isActionAviable);
    }

    public void                 setNewAction(String action)
    {
        _actions.add(action);
        return;
    }

    public void                 setNewActions(List<String> actions)
    {
        for (String s: actions) {
            _actions.add(s);
        }
        return;
    }

    public String               getLastAction()
    {
        return (_actions.get(_actions.size() - 1));
    }

    public ArrayList<String>    getActions()
    {
        return (_actions);
    }

    public void                 cleanActions()
    {
        _actions.clear();
        return;
    }

    public void                 cleanLastAction()
    {
        _actions.remove(_actions.size() - 1);
        return;
    }

    public void                 cleanAction(int index)
    {
        _actions.remove(index);
        return;
    }

    abstract void               exec();
}
