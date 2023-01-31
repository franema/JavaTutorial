package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * _Function
 */
public class _Function {

    public static void main(String[] args) {
        increment(0);

        System.out.println(IncrementByOne.apply(0));

        Function<Integer, Integer> Something = IncrementByOne.andThen(MultiplyByTen);
        System.out.println(Something.apply(3));

        System.out.println(AddAndMultiply.apply(2, 2));
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
}