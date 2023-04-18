/**
 * Created by Victor Isaikin
 */
public class Main {
    public static void main(String[] args) {
        int money = 1000;

        if(money < 2000){
            System.out.println("I will buy a book");
        }
        else if(money >= 10000){
            System.out.println("I will buy a lot of book");
        }else if(money < 10000){
            System.out.println("Here");
        }else {
            System.out.println("I don't have a money");
        }

//        System.out.println(money > 2000 ? "I will buy a book" : "I don't have a money");
    }
}