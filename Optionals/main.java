package Optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {

        // Supplier<IllegalStateException> exception = () -> new IllegalStateException("Exception");

    //    Object value = Optional.ofNullable("Algo")
    //         // .orElseThrow(() -> new IllegalStateException("Exception"));
    //         .orElseThrow(exception);

    //     System.out.println(value);

    Optional.ofNullable(null)
        .ifPresentOrElse(email -> System.out.println("Sending to " + email), () -> {
            System.out.println("No email");
        });
    }
}
