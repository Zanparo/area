package eu.epitech;

import org.springframework.core.annotation.Order;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created by lucien on 31/12/2016.
 */
public class FacebookObserver extends AAction {

    void     exec()
    {
        System.out.println("EXEC FACEBOOK");
        /*
        if (connectionRepository.findPrimaryConnection(Facebook.class) != null) {

            System.out.println("Get Posts ...");

            ArrayList<Post> feed = facebook.feedOperations().getFeed();
            for(int i = 0; i < feed.size(); ++i)
            {
                System.out.println(feed.get(i).getMessage()); // Get message from latest posts.
            }
        }
        */
    }

}
