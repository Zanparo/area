package eu.epitech;

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

    @RequestMapping("/facebookConnect")
    public String facebookConnect(@RequestParam(value="test", required=false, defaultValue="World") String name, Model model) {

        return "facebookConnect";
    }

    @PostMapping("/facebookConnect")
    public String facebookSubmit(@RequestParam("email") String email, @RequestParam("password") String password) {

        System.out.println(email);
        System.out.println(password);

        return "redirect:/";
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
