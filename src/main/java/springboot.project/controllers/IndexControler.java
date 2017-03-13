package springboot.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by livhuwani on 2017/01/18.
 */
@Controller
public class IndexControler {

    @RequestMapping("/")
    public String index() {
    return  "index";
}
}