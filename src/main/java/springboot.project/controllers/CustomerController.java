package springboot.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springboot.project.domain.Customer;
import springboot.project.services.CustomerService;

/**
 * Created by livhuwani on 2017/01/19.
 */
@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public String listAllCustomers(Model model){
        model.addAttribute("customers", customerService.listAllCustomer());
        return "customers";
    }
    @RequestMapping("/customer/{id}")
    public String getCustormerById(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer";
    }

    @RequestMapping("/customer/edit/{id}")
    public String editCustormer(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customerform";
    }

    @RequestMapping("/customer/new")
    public  String addNewCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "customerform";
    }


    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public  String saveOrUpdateCustomer(Customer customer) {
        Customer savedCustomer = customerService.saveOrUpdateCustomer(customer);
        return "redirect:/customer/"+savedCustomer.getId();
    }

    @RequestMapping("/customer/delete/{id}")
    public String  deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers/";
    }
}
