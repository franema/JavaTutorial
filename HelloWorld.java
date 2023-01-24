import java.util.Arrays;
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

        // String message = "Hello World" + "!!";
        // System.out.println(message.endsWith("!!"));
        // System.out.println(message);
        // System.out.println(message.length());
        // System.out.println(message.indexOf("o"));
        // System.out.println(message.replace("o", "a"));
    
        // Arrays

        // Old Way
        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[2] = 10;
        
        // System.out.println(Arrays.toString(numbers));
        // int[] numbers = {1, 2, 3, 4}; 
        // System.out.println(numbers.length);

        // Multidimensional Arrays 

        // int [][] numbers2D = new int [3][2];
        // numbers2D[0][0] = 1;
        // System.out.println(Arrays.deepToString(numbers2D));

        // int[][] numbers = {{1, 2, 3}, {4, 5}};
        // System.out.println(Arrays.deepToString(numbers));

        // Constants

        // final float Pi = 3.14F;

        // Arithmetic Expressions
        // double result = (double)10 / (double)3;
        // System.out.println(result);
       
        
        // Implicit Casting
        // byte to > short > int> long > float > double. It only happen if data is not lost
        // short x = 1;
        // int y = x + 2;
        // System.out.println(y);

        // Explicit Casting
        // double x = 1.1;
        // int y = (int)x + 2;
        // System.out.println(y);
    
        String x = "1";
        int y = Integer.parseInt(x) + 2; // Float, Short etc..
        System.out.println(y);

    }
}