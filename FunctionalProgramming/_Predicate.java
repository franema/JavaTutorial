package FunctionalProgramming;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        // System.out.println(isNumberValid.test("0700"));
        // System.out.println(isNumberValid.test("0900"));

        System.out.println(isNumberValid.and(containsNumber3).test("0300"));
        System.out.println(isNumberValid.or(containsNumber3).test("0300"));
        System.out.println(isNumberValid.and(containsNumber3).test("0730"));
    }

    // static boolean isNumberValid (String phoneNumbe) {
    // return phoneNumbe.startsWith("07") && phoneNumbe.length() == 4;
    // }

    // Predicate. Boolena-valued function of one argument
    static Predicate<String> isNumberValid = number -> 
            number.startsWith("07") && number.length() == 4;

    static Predicate<String> containsNumber3 = number ->
        number.contains("3");
}
