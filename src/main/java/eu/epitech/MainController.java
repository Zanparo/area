package eu.epitech;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lucien on 12/12/2016.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "./html/index.html";
    }

}
