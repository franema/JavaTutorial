package FunctionalProgramming;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getURL.get());
    }

    //Supplier. Represents a supplier of results

    // static String getURL () {
    //     return "jdbc://localhost:5432/users";
    // }

    static Supplier<String> getURL = () -> "jdbc://localhost:5432/users";
}
