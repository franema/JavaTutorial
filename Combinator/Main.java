package Combinator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Customer customer = new Customer(
            "Cacho",
            "cacho@cacho",
            "+02454",
            LocalDate.of(1998, 12, 25));
        
        CustomerValidatorService validatorService = new CustomerValidatorService(); 
        System.out.println(validatorService.isCustomerValid(customer));
    }

}
