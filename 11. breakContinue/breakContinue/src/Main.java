/**
 * Created by Victor Isaikin
 */

public class Main {
    public static void main(String[] args) {
        int index = 0;

        parent:
        while (++index <= 4){
            System.out.println("Index " + index);
            int innerIndex = 0;

            while (++innerIndex <= 4){
                if(innerIndex == 3){
                    break parent;
                }
                System.out.println("-- Inner Index " + innerIndex);
            }
        }

//        int index = 0;
//
//        while (++index <= 4){
//            if(index % 2 == 0){
//                continue;
//            }
//            System.out.println("Index = " + index);
//        }
    }
}