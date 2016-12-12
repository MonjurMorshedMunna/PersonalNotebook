package notebook.controllers.immutable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by monju on 13-Dec-16.
 */
@RestController()
public class HomeResource {

    @RequestMapping("/all")
    public String home(){
        return "home";
    }
}
