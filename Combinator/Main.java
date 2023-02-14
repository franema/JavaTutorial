package Combinator;

import java.time.LocalDate;

import Combinator.CustomerRegistrationValidator.ValidationResult;

public class Main {
    public static void main(String[] args) {
        
        Customer customer = new Customer(
            "Cacho",
            "cacho@cacho",
            "02454",
            LocalDate.of(1998, 12, 25));
        
        // CustomerValidatorService validatorService = new CustomerValidatorService(); 
        // System.out.println(validatorService.isCustomerValid(customer));

        ValidationResult result = CustomerRegistrationValidator
            .isEmailValid()
            .and(CustomerRegistrationValidator.isPhoneValid())
            .and(CustomerRegistrationValidator.isAdult())
            .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }

}
