package springboot.project.services;

import springboot.project.domain.Customer;

import java.util.List;

/**
 * Created by livhuwani on 2017/01/19.
 */
public interface CustomerService {

    List<Customer> listAllCustomer();

    Customer getCustomerById(Integer id);
    Customer saveOrUpdateCustomer(Customer customer);

    void deleteCustomer(Integer id);
}
