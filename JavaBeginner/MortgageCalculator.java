package JavaBeginner;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal;
        while(true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000) 
                break;
            System.out.println("Enter a number between $1K and $1M");
            
        }

        float annualInterestRate;
        while(true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if(annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        int period;
        while(true) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if(period > 0 && period <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }
        int numberOfPayments = period * MONTHS_IN_YEAR;


        float firstHalfCalculus = (float)Math.pow((monthlyInterest + 1), numberOfPayments);
        float mortgagePayments = principal * ((monthlyInterest * firstHalfCalculus) / (firstHalfCalculus - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayments);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
