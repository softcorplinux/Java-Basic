import java.util.Scanner;

/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int finish = scanner.nextInt();
        int index = 0;

        while (index++ < finish){
            System.out.println("Book " + index);
        }


    }
}