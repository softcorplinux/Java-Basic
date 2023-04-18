/**
 * Created by Victor Isaikin
 */
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("---------------");
//        System.out.println(true == 1);

        char ch1 = 'a'; // 97
        char ch2 = 'b'; // 98
        System.out.println(a > b);

        System.out.println("---------------");
        String s1 = "Victor";
        String s2 = "Isaikin";
//        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}