package springboot.project.controllers;

/**
 * Created by livhuwani on 2017/03/13.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springboot.project.domain.Attendee;
import springboot.project.services.ConferenceService;

@Controller
public class ConferenceController {

    private ConferenceService conferenceService;

    @Autowired
    public void setProductService(ConferenceService conferenceService) {
        this.conferenceService = conferenceService;
    }

    @RequestMapping("/registration/new")
    public String register(Model model) {
        model.addAttribute("attendee", new Attendee());
        return  "conferenceregistration";

    }
//    @RequestMapping("/congratulations")
//    public String congratulations(@PathVariable Integer id) {
//        productService.deleteProduct(id);
//        return  "congratulations";
//
//    }
}

