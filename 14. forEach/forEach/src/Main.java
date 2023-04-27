/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println("Loop For");
        for (int index = 3; index < array.length; index++){
            System.out.println(array[index]);
        }

        System.out.println("Loop ForEach");
        for (int number: array){
            if(number % 2 == 0){
                continue;
            }
            System.out.println(number);
        }
    }
}