package eu.epitech;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lucien on 12/12/2016.
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String credentialsForm(Model model) {
        model.addAttribute("credentials", new Credentials());
        return "credentials";
    }

    @PostMapping("/")
    public String credentialsSubmit(@ModelAttribute Credentials credentials) {

        System.out.println(credentials.getEmail());
        System.out.println(credentials.getPassword());

        return "credentials";
    }

}
