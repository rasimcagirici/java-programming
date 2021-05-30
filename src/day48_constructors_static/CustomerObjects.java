package day48_constructors_static;

import javax.swing.text.DefaultEditorKit;
import java.util.*;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1);
        customer1.setId(456731204);
        customer1.setName("Bob");
        System.out.println(customer1);
        Customer customer2 = new Customer("Rasim Cagirici", 453265789);
        Customer customer3 = new Customer("Nurseda Cagirici", 453218765);
        System.out.println(customer2);
        System.out.println(customer3);

        Customer[] todaysCustomers = {customer1, customer2, customer3, new Customer("Yusuf Emre Cagirici", 432678543)};
        List<Customer> customersList = new ArrayList<>();
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(todaysCustomers[3]);
        customersList.add(new Customer("Thomas Muracel", 432754903));
        //System.out.println(todaysCustomers[0].toString());
        //System.out.println(customersList.get(0).toString());

        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }

        for (Customer eachCustomer : customersList) {
            System.out.println(eachCustomer);
        }

        customersList.forEach(each -> System.out.println(each.getName()));
    }
}
