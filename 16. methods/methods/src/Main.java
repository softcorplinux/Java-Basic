/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Victor";
        u1.age = 40;
        u1.greeting();
        u1.iAm();

        System.out.println("");
        User u2 = new User();
        u2.name = "Denis";
        u2.age = 42;
        u2.greeting();
        u2.greeting();
        u2.iAm();

    }
}

class User {
    String name;
    byte age;

    void greeting(){
        System.out.println("My name is " + name);
    }

    void iAm(){
        System.out.println("I am " + age);
    }
}