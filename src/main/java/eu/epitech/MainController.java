package eu.epitech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lucien on 12/12/2016.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String dashboard(@RequestParam(value="test", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("test", "Hello World !");
        return "dashboard";
    }

}
