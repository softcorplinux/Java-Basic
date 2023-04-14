/**
 * Created by Victor Isaikin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 / 2);
        System.out.println(2 * 2);

        System.out.println("--------%-------");
        System.out.println(5 % 2); // 5 - 2 = 3 - 2 = 1
        System.out.println(8 % 3); // 8 - 3 = 5 - 3 = 2
        System.out.println(8 % 4);

        System.out.println("--------+-------");
        System.out.println("Victor" + " Isaikin" + ": 40 years old");
        System.out.println("1" + 2);
        System.out.println(2 + 2 + "1");

        System.out.println("--------=-------");
        int age = 40;
        System.out.println(age);

        int a,b,c;
        a = b = c = 2 + 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("----------------");
        int n = 2;
//        n = n + 5;
//        n += 5;
//        n = n * 5;
        n *= 5;

        System.out.println(n);

        System.out.println("--------++-------");
        int counter = 2;
//        counter--;
        counter++;
        System.out.println(counter);

        int couner2 = 1;
        int d = couner2--;
        System.out.println(d);
        System.out.println(couner2);

    }
}