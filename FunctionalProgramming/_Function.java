package FunctionalProgramming;

import java.lang.reflect.Constructor;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * _Function
 */
public class _Function {

    public static void main(String[] args) {
        // increment(0);

        // System.out.println(IncrementByOne.apply(0));

        // Function<Integer, Integer> Something = IncrementByOne.andThen(MultiplyByTen);
        // System.out.println(Something.apply(3));

        // System.out.println(AddAndMultiply.apply(2, 2));

        Customer carlos = new Customer("Carlos", 45454545);
        greetCustomer.accept(carlos);
    }

    // Function
    static Function<Integer, Integer> IncrementByOne = num -> ++num;

    static Function<Integer, Integer> MultiplyByTen = num -> num * 10;

    // BiFunction

    static BiFunction<Integer, Integer, Integer> AddAndMultiply = (numberToIncrement,
            numberToMultiply) -> (numberToIncrement + 1) * numberToMultiply;

    static int increment(int num) {
        return num + 1;
    }

    // static void greetCustomer (Customer customer) {
    // System.out.println("Hello " + customer.customerName);
    // }

    
    //Consumer. Like a void function. Accepts one argument, returns nothing. BiConsumer taker two arguments

    static Consumer<Customer> greetCustomer = customer -> System.out.println(customer.customerName + ("*".repeat(String.valueOf(customer.customerPhoneNumber).length())));;

    static class Customer {

        private final String customerName;
        private final int customerPhoneNumber;

        public Customer(String customerName, int customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}