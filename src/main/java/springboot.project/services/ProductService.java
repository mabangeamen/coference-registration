package springboot.project.services;

import springboot.project.domain.Attendee;
import springboot.project.domain.Product;

import java.util.List;

/**
 * Created by livhuwani on 2017/01/18.
 */
public interface ProductService {

    List<Product> listAllProducts();

    Product getProdutcById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(Integer id);
    Attendee saveOrUpdateAttendee(Attendee attendee);
    List<Attendee> listAllAttendees();
}
