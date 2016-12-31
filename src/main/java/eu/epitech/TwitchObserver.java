package eu.epitech;

import de.tobj.twitch.streamobserver.TwitchStreamObserver;
import de.tobj.twitch.streamobserver.channel.event.StreamStatusEvent;
import de.tobj.twitch.streamobserver.channel.event.StreamUpdateEvent;
import de.tobj.twitch.streamobserver.channel.listener.StreamListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by Mimoone on 20/12/2016.
 */
public class                        TwitchObserver extends AAction
{
    private static final Logger logger = LogManager.getLogger(TwitchObserver.class);
    private TwitchStreamObserver    _observer;

    TwitchObserver()
    {
        _observer = new TwitchStreamObserver("akjhceuw45sfdlva4r7afva4266gbe");
    }

    TwitchObserver(String clientId)
    {
        _observer = new TwitchStreamObserver(clientId);
    }

    TwitchObserver(String clientId, ArrayList<String> names)
    {
        _observer = new TwitchStreamObserver(clientId);
        for (String s: names)
        {
            _observer.addChannel(s);
        }
    }

    TwitchObserver(ArrayList<String> names)
    {
        for (String s: names)
        {
            _observer.addChannel(s);
        }
    }

    void                        addChannel(String name)
    {
        _observer.addChannel(name);
        return;
    }

    void                        addChannels(ArrayList<String> names)
    {
        for (String s: names)
        {
            _observer.addChannel(s);
        }
        return;
    }

    void                        exec()
    {
        _observer.addListener(new StreamListener() {
            @Override
            public void streamIsOnline(StreamStatusEvent event)
            {
                logger.info("-> Now online: " + event.toString());
                System.out.println("event online = " + event.toString());
                setNewAction(event.toString());
            }

            @Override
            public void streamIsOffline(StreamStatusEvent event)
            {
                logger.info("-> Now offline: " + event.toString());
                System.out.println("event offline = " + event.toString());
                setNewAction(event.toString());
            }

            @Override
            public void streamUpdate(StreamUpdateEvent event)
            {
                logger.info("-> Update: " + event.toString());
                System.out.println("event update = " + event.toString());
                setNewAction(event.toString());
            }
        });
        _observer.start();
        return;
    }

}

