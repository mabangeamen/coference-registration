//package springboot.project.controllers;
//
///**
// * Created by livhuwani on 2017/03/13.
// */
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import springboot.project.domain.Attendee;
//
//
//import springboot.project.services.ConferenceService;
//import springboot.project.services.RegistrationService;
//
//
//@Controller
//public class ConferenceController {
//
//    private RegistrationService registrationService;
//
//    @Autowired
//    public void setConferenceService(RegistrationService registrationService) {
//        this.registrationService = registrationService;
//    }
//
//    @RequestMapping("/registration/new")
//    public String register(Model model) {
//        model.addAttribute("attendee", new Attendee());
//        return  "conferenceregistration";
//
//    }
//
//    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
//    public String saveOrUpdateProduct(Attendee attendee){
//        Attendee savedProduct= registrationService.saveOrUpdateAttendee(attendee);
//        return  "redirect:/attendee/"+ savedProduct.getId();
//    }
//
////    @RequestMapping("/congratulations")
////    public String congratulations(@PathVariable Integer id) {
////        productService.deleteProduct(id);
////        return  "congratulations";
////
////    }
//
//}
//
