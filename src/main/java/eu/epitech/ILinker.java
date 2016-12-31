package eu.epitech;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mimoone on 22/12/2016.
 */
public interface            ILinker
{
    void                    setName(String name);
    String                  getName();
    void                    addAction(AAction action);
    void                    addReaction(AAction reaction);
    void                    addActions(ArrayList<AAction> actions);
    void                    addReaction(ArrayList<AAction> reactions);
    AAction                 getAction(int index);
    AAction                 getReaction(int index);
    ArrayList<AAction>      getActions();
    ArrayList<AAction>      getReactions();
}
