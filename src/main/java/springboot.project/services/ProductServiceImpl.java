package springboot.project.services;

import org.springframework.stereotype.Service;
import springboot.project.domain.Product;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by livhuwani on 2017/01/18.
 */
@Service
public class ProductServiceImpl implements ProductService{
    private Map<Integer,Product> products;

    public ProductServiceImpl() {
        loadProducts();
    }

    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product getProdutcById(Integer id) {
        return products.get(id);
    }

    @Override
    public Product saveOrUpdateProduct(Product product) {

        if (product != null){
            if (product.getId() == null){
                product.setId(getNextKey());
            }

            products.put(product.getId(), product);
            return  product;
        }else {
            throw new RuntimeException("Product Can't be null");
        }
    }

    @Override
    public void deleteProduct(Integer id) {
        products.remove(id);
    }

    private  Integer getNextKey(){
        return Collections.max(products.keySet())+1;
    }
    private void loadProducts() {

        products = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setDescription("Product 1");
        product1.setPrice(new BigDecimal("12.23"));
        product1.setImageUrl("http/traning/.com/prodict1");

        products.put(1,product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("Product 2");
        product2.setPrice(new BigDecimal("13.23"));
        product2.setImageUrl("http/traning/.com/prodict2");

        products.put(2,product2);


        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("Product 3");
        product3.setPrice(new BigDecimal("14.23"));
        product3.setImageUrl("http/traning/.com/prodict3");

        products.put(3,product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setDescription("Product 4");
        product4.setPrice(new BigDecimal("15.23"));
        product4.setImageUrl("http/traning/.com/prodict4");

        products.put(4,product4);


        Product product5 = new Product();
        product5.setId(5);
        product5.setDescription("Product 5");
        product5.setPrice(new BigDecimal("17.23"));
        product5.setImageUrl("http/traning/.com/prodict5");

        products.put(5,product5);


    }

}
