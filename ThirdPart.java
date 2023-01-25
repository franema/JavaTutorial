import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
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
        // LinkedList<Integer> t = new LinkedList<Integer>();
        // t.add(3);
        // t.add(-5);
        // t.add(8);
        // t.add(5);
        // t.add(4);
        // System.out.println(t);

        // Maps and HashMaps
        // Hashmaps: unique and unordered. If I asign something to the same key, it
        // overrides it
        // Map m = new HashMap();
        // m.put("tim", 5);
        // m.put("joe", "x");
        // m.put(11, 9.99);
        // m.put(11, 9.97);

        // System.out.println(m);
        // System.out.println(m.get("joe"));

        // TreeMap. The keys must be the same kind of variable, beacause it's sorted.
        // Map m = new TreeMap();
        // m.put("tim", 5);
        // m.put("joe", "x");
        // m.put("a", "x");

        // System.out.println(m);
        // System.out.println(m.get("joe"));

        // LinkedHashMap. Keeps the order in which elements were added.
        // Map m = new LinkedHashMap();
        // m.put("tim", 5);
        // m.put("joe", "x");
        // m.put("a", "x");
        // m.put(1, "x");

        // System.out.println(m);
        // System.out.println(m.get("joe"));

        // //Map methods
        // System.out.println(m.containsValue(5));
        // System.out.println(m.containsKey("a"));
        // System.out.println(m.values());
        // System.out.println(m.keySet());
        // m.remove("a")
        // m.clear();
        // m.isEmpty();

        // Exercise
        // String[] letters = {"a", "b", "a", "e", "r", "a", "a", "r", "r", "t"};
        // Map<String, Integer> countedLetters = new HashMap();

        // for (String letter : letters) {
        // if(countedLetters.containsKey(letter)) {
        // countedLetters.put(letter, countedLetters.get(letter) + 1);
        // } else {
        // countedLetters.put(letter, 1);
        // }
        // }
        // System.out.println(countedLetters);

        // Array Sort
        // int[] numbers = {-12, 0, 2, -4, 16, 5, 122, 8, 8};

        // // Arrays.sort(numbers, 1, 4);
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));

        // Methods

        // myMethod("I'm a method", 4);
        // System.out.println(add2(4, 8));


        // Classes

        // Dog dog1 = new Dog("cacho", 24);
        // dog1.speak();
        // Dog dog2 = new Dog("pepe", 4);
        // dog2.speak();
        // Dog dog3 = new Dog("Cosme", 2);
        // dog3.speak();
        // System.out.println(dog1.getAge());
        // dog1.setAge(5);
        // System.out.println(dog1.getAge());

        
        //Inheritance

        Cat cat1 = new Cat("Pepe", 10, 200);
        cat1.speak();

    }

    // //Methods
    // public static void myMethod(String str, int x) {
    //     for (int i = 0; i < x; i++) {
    //         System.out.println(str);
    //     }
    // }

    // public static int add2(int num1, int num2) {
    //     return num1 + num2;
    // }

    

}
