package eu.epitech;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mimoone on 20/12/2016.
 */
public interface        IAction
{
    void                setName(String name);
    String              getName();
    boolean             isActionAviable();
    void                setNewAction(String action);
    void                setNewActions(List<String> actions);
    String              getLastAction();
    ArrayList<String>   getActions();
    void                cleanActions();
    void                cleanLastAction();
    void                cleanAction(int index);
}
