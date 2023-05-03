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
        byte retirement1 = u1.retirement();
        System.out.println("I will go to pension " + retirement1 + " years");

        System.out.println("");
        User u2 = new User();
        u2.name = "Denis";
        u2.age = 42;
        u2.greeting();
        u2.iAm();
        byte retirement2 = u2.retirement();
        System.out.println("I will go to pension " + retirement2 + " years");
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

    byte retirement(){
        return (byte)(65 - age);
    }
}