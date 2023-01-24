import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int numberOfPayments = period * MONTHS_IN_YEAR;


        float firstHalfCalculus = (float)Math.pow((monthlyInterest + 1), numberOfPayments);
        float mortgagePayments = principal * ((monthlyInterest * firstHalfCalculus) / (firstHalfCalculus - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayments);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
