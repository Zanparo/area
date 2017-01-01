package eu.epitech;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lucien on 18/12/2016.
 */

@Controller
public class ConnectController {

    private Facebook                facebook;
    private ConnectionRepository    connectionRepository;

    public ConnectController(Facebook facebook, ConnectionRepository connectionRepository) {
        System.out.println("ConnectController");
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @RequestMapping("/facebook")
    public String ConnectFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "connect/facebookConnect";
        }

        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        PagedList<Post> feed = facebook.feedOperations().getFeed();
        model.addAttribute("feed", feed);
        return "facebook";
    }

    @RequestMapping("/twitchObserver")
    public String twitchAdd(@RequestParam(value="test", required=false, defaultValue="World") String name, Model model) {

        return "facebookConnect";
    }

    @PostMapping("/twitchObserver")
    public String twitchSubmit(@RequestParam("streamer") String email, @RequestParam("password") String password) {

        System.out.println(email);
        System.out.println(password);

        return "redirect:/";
    }

}
