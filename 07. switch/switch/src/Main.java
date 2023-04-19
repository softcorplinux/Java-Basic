import java.util.Scanner;

/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt(); // 30

        System.out.println("Enter your name:");
        scanner.nextLine();
        String name = scanner.nextLine();

        switch (age){
            case 30:
                System.out.println("Your age is 30");
            case 40:
                System.out.println("Your age is 40");
                break;
            default:
                System.out.println("Your are not entered age");
                break;
        }

        switch (name){
            case "Victor":
                System.out.println("Your name is Victor");
                break;
            case "Natalia":
                System.out.println("Your name is Natalia");
                break;
            default:
                System.out.println("Your are not entered name");
                break;
        }


    }
}