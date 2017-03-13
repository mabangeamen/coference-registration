package springboot.project.services;

import org.springframework.stereotype.Service;
import springboot.project.domain.Customer;

import java.util.*;

/**
 * Created by livhuwani on 2017/01/19.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer,Customer> customers;

    public CustomerServiceImpl() {
        loadList();
    }

    @Override
    public List<Customer> listAllCustomer() {
        return new ArrayList<> (customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customers.get(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (customer != null){
            if (customer.getId() == null){
                customer.setId(getNextKey());
            }

            customers.put(customer.getId(), customer);
            return  customer;
        }else {
            throw new RuntimeException("Customer Can't be null");
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        customers.remove(id);
    }

    private  Integer getNextKey(){
        return Collections.max(customers.keySet())+1;
    }


    public void loadList() {

        customers = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setAddressLine1("60 Pitchard Street");
        customer1.setAddressLine2("15 Elston");
        customer1.setCity("Johannesburg");
        customer1.setEmail("email@email.com");
        customer1.setFirstName("Amen");
        customer1.setLastName("Lvhuwani");
        customer1.setPhoneNumber("0715596518");
        customer1.setState("Gauteng");
        customer1.setZipCode("2001");

        customers.put(1, customer1);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setAddressLine1("02 Ave");
        customer2.setAddressLine2("24 Perul street");
        customer2.setCity("City York");
        customer2.setEmail("jpopo@email.com");
        customer2.setFirstName("JPopo");
        customer2.setLastName("Dauld");
        customer2.setPhoneNumber("012596518");
        customer2.setState("Jojo");
        customer2.setZipCode("2234");

        customers.put(2, customer2);

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setAddressLine1("23 wwo Street");
        customer3.setAddressLine2("22 free street");
        customer3.setCity("Merlyn");
        customer3.setEmail("peter@email.com");
        customer3.setFirstName("Peter");
        customer3.setLastName("goglie");
        customer3.setPhoneNumber("082346518");
        customer3.setState("wowo");
        customer3.setZipCode("231");

        customers.put(3, customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setAddressLine1("12 amen Street");
        customer4.setAddressLine2("34 Commisionor Avenue");
        customer4.setCity("Lands City");
        customer4.setEmail("gorge@email.com");
        customer4.setFirstName("Gorge");
        customer4.setLastName("Glen");
        customer4.setPhoneNumber("0643436518");
        customer4.setState("Mabange");
        customer4.setZipCode("2034");

        customers.put(4, customer4);
    }
}
