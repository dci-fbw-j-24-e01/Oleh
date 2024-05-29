import java.io.File;
import java.io.FileNotFoundException;

import java.util.List;

public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {

//        List<Customer> customers = DataReader.readData("customers-1000.csv");
        List<Customer> customers = DataReader.readData("customers-100000.csv");
//        customers.forEach(System.out::println);
        int france = 0;
        int startYear = 0;

        for (Customer customer : customers) {
            if (customer.country().equals("France")) {
                france++;
            }
            if (customer.subscriptionDate().getYear() == 2020) {
                startYear++;
            }
        }

        System.out.println("We have " + france + " Peoples from France ");
        System.out.println("And " + startYear + " customers from 2020 ");



    }
}
