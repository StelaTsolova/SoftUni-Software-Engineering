import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars_2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.31;
        System.out.println(String.format("%.3f", dollars));
    }
}
