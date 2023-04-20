import java.util.Scanner;

/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        double spent;
        double total = 0;

        do {
            System.out.println("How much have you spent this month? ");
            spent = scanner.nextDouble();
            total += spent;

            System.out.println("Do you want to continue filling out the form? (y/n)");
            scanner.nextLine();
            s = scanner.nextLine();
        }while (s.toLowerCase().equals("y"));

        System.out.println("The total amount you spent " + total);
    }
}