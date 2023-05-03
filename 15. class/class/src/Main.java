/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Victor";
        u1.age = 40;

        System.out.println(u1.name + " " + u1.age + " years old");
        System.out.println("-----------------------------------");

        User u2 = new User();
        u2.name = "Denis";
        u2.age = 42;
        System.out.println(u2.name + " " + u2.age + " years old");
    }
}

class User {
    String name;
    byte age;
}