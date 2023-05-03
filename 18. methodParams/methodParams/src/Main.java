/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Victor";
        u1.age = 40;
        byte r1 = u1.retirement(65);
        System.out.println("I will go to pension " + r1 + " years");

        System.out.println("");
        User u2 = new User();
        u2.name = "Natalia";
        u2.age = 30;
        byte r2 = u2.retirement(60);
        System.out.println("I will go to pension " + r2 + " years");
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

    byte retirement(int years){
        return (byte)(years - age);
    }
}