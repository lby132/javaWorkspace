package chap_02.Quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q {
    public static void main(String[] args) {
        Customer customer = new Customer("a", 12);
        Customer customer2 = new Customer("b", 15);
        Customer customer3 = new Customer("c", 22);
        Customer customer4 = new Customer("d", 23);
        List<Customer> customers = Arrays.asList(customer, customer2, customer3, customer4);

        customers.stream().map(x -> x.age >= 20 ? x.name + "5000원" : x.name + "0원").forEach(System.out::println);


        try {
            System.out.println("a");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }


    static class Customer {
        private String name;
        private int age;


        public Customer(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
