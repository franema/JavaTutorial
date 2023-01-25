import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ThirdPart {

    public static void main(String[] args) {

        // Nested statements
        // System.out.print("Input yout age: ");
        // Scanner scanner = new Scanner(System.in);
        // String stringAge = scanner.nextLine();
        // int age = Integer.parseInt(stringAge);

        // if (age >= 18) {
        // System.out.print("Input your fav food: ");
        // String food = scanner.nextLine();
        // if(food.equals("pizza")) {
        // System.out.println("Mine too");
        // } else {
        // System.out.println("Not mine");
        // }
        // } else if (age >= 13) {
        // System.out.println("You are a teenager");
        // } else {
        // System.out.println("You cannot ride");
        // }

        // Sets and Lists
        // Sets.
        // HashSet: Unordered and unique.
        // Set<Integer> t = new HashSet<Integer>();
        // t.add(5);
        // t.add(7);
        // t.add(5);
        // t.add(9);
        // t.add(-9);

        // boolean x = t.contains(5);

        // t.remove(9);
        // t.clear();
        // t.isEmpty();
        // t.size();

        // System.out.println(t);

        // TreeSet: Unique, but ordered in a tree data structure
        // Set<Integer> t = new TreeSet<Integer>();
        // t.add(5);
        // t.add(7);
        // t.add(5);
        // t.add(9);
        // t.add(1);

        // System.out.println(t);

        // LinkHashSet: same as a set, but linked. Keeps the creation order, faster to
        // navigate
        // Set<Integer> t = new LinkedHashSet<Integer>();
        // t.add(5);
        // t.add(7);
        // t.add(5);
        // t.add(9);
        // t.add(1);
        // t.add(8);
        // t.add(2);

        // System.out.println(t);

        // Lists
        // ArrayList
        // ArrayList<Integer> t = new ArrayList<Integer>();
        // t.add(1);
        // t.add(1);
        // t.add(3);
        // t.add(3);
        // t.add(6);
        // t.add(8);
        // t.add(5);
        // t.remove(3);
        // t.set(0, 5);
        // t.size();
        // t.isEmpty();
        // t.subList(1, 3);

        // int x = t.get(0);

        // System.out.println(t);
        // System.out.println(x);

        // LinkedList
        LinkedList<Integer> t = new LinkedList<Integer>();
        t.add(3);
        t.add(-5);
        t.add(8);
        t.add(5);
        t.add(4);
        System.out.println(t);

    }

}
