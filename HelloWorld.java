import java.util.Date;
import java.awt.*;

/**
 * Hello
 */
public class HelloWorld {

    public static void main(String[] args){
        // Primitives
        // byte myAge = 30;
        // int herAge = myAge;
        // long viewsCount = 3_123_456_789L;
        // float price = 10.99F;
        // char letter = 'A';
        // boolean isEligible = false;
        // System.out.println("Hello World");
        // System.out.println(herAge);
        // System.out.println(viewsCount);


        // Reference

        // Date now = new Date();
        // System.out.println(now);
        // System.out.print(now);

     
        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // point1.x = 2;
        // System.out.println(point2);

        // String

        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.replace("o", "a"));
    }
}