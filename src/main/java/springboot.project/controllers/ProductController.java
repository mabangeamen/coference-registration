package springboot.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springboot.project.domain.Attendee;
import springboot.project.domain.Product;
import springboot.project.services.ProductService;

/**
 * Created by livhuwani on 2017/01/18.
 */
@Controller
public class ProductController {

private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public  String listProduts(Model model) {
        model.addAttribute("products",productService.listAllProducts());
        return "products";
    }

    @RequestMapping("/product/{id}")
     public String getProduct(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProdutcById(id));
        return  "product";

     }

     @RequestMapping("product/edit/{id}")
     public String edit(@PathVariable Integer id, Model model){
         model.addAttribute("product", productService.getProdutcById(id));
         return  "productform";
     }

     @RequestMapping("/product/new")
    public String newProduct(Model model){
         model.addAttribute("product", new Product());
         return  "productform";
     }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveOrUpdateProduct(Product product){
          Product savedProduct= productService.saveOrUpdateProduct(product);
          return  "redirect:/product/"+ savedProduct.getId();
     }

     @RequestMapping("product/delete/{id}")
     public String delete(@PathVariable Integer id) {
         productService.deleteProduct(id);
         return  "redirect:/products/";

     }
    @RequestMapping("/attendee/new")
    public String register(Model model) {
        model.addAttribute("attendee", new Attendee());
        return  "attendeeform";

    }

    @RequestMapping(value = "/attendee", method = RequestMethod.POST)
    public String saveOrUpdateProduct(Attendee attendee){
        Attendee savedProduct= productService.saveOrUpdateAttendee(attendee);
        return  "redirect:/attendee/"+ savedProduct.getId();
    }
    @RequestMapping("/congratulations")
    public String congratulations(@PathVariable Integer id) {
        productService.deleteProduct(id);
        return  "congratulations";

    }

    @RequestMapping("/attendees")
    public  String listAttendees(Model model) {
        model.addAttribute("attendee",productService.listAllAttendees());
        return "attendees";
    }
}
