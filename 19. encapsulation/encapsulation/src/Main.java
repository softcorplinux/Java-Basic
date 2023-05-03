/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("Victor");
        u1.setAge(40);
        u1.greeting();
        u1.iAm();
    }
}

class User {
    private String firstName;
    private byte age;

    void setFirstName(String firstName){
        if(firstName.isEmpty()){
            System.out.println("The name is empty");
        }else {
            this.firstName = firstName;
        }
    }

    String getFirstName(){
        return this.firstName;
    }

    void setAge(int age){
        if(age < 0 || age > 122){
            System.out.println("The age is not valid");
        }else{
            this.age = (byte)age;
        }
    }

    byte getAge(){
        return this.age;
    }

    void greeting(){
        System.out.println("My name is " + this.firstName);
    }

    void iAm(){
        System.out.println("I am " + this.age);
    }

    byte retirement(int years){
        return (byte)(years - this.age);
    }
}