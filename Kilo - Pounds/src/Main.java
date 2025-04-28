import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String convert;
        double amount;

        System.out.println("USE COMMA FOR DECIMAL POINTS");
        System.out.println("What conversion do you want to do?");
        System.out.printf("K-P / P-K: ");
        convert = scanner.nextLine().toLowerCase();

        System.out.printf("What amount do you want to convert?: ");
        amount = scanner.nextDouble();

        if (convert.equals("k-p")) {
            double pounds = amount * 2.2;
            System.out.printf("That would be %.2f pounds.", pounds);
        }

        else if (convert.equals("p-k")) {
            double kilos = amount / 2.2;
            System.out.printf("That would be %.2f kilo's", kilos);
        }

        else {
            System.out.println("Something went wrong, please try again.");
        }

        scanner.close();
    }
}