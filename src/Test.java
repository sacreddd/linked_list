import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test{
    public static void main(String[] args) {
        final Random random = new Random();
        LinkedList<Integer> link = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            link.add(i+1);
        }
//        System.out.println(Arrays.toString(link.toArray()));
//        link.reverse(5);
//        System.out.println(Arrays.toString(link.toArray()));

        long startTime = System.currentTimeMillis();
        link.reverse(4);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
//
        LinkedList<Integer> link3 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            link3.add(i+1);
        }
        startTime = System.currentTimeMillis();
        link3.notOptimizedReverse(4);
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");


//        System.out.println(Arrays.toString(link2.toArray()));
//        System.out.println(link.isEmpty());
//        System.out.println(link.contains(3));
////        link.addInd(5, 40);
//        System.out.println(Arrays.toString(link.toArray()));
//        System.out.println(link.size());
////        link.remove(5);
//        System.out.println(Arrays.toString(link.toArray()));
//        System.out.println(link.size());
//        link.clear();
//        System.out.println(Arrays.toString(link.toArray()));

//        long startTime = System.currentTimeMillis();
//
//        int counter = 0;
//        for (int j = 0; j < 1000; j++) {
//            link.add(random.nextInt());
////            System.out.println(counter++);
//        }
//
//        for (int i = 0; i < 1000; i++) {
//            int size = link.size();
//            for (int j = 0; j < 3000; j++) {
//                link.addInd(random.nextInt(), Math.abs(random.nextInt() % size));
//                size++;
////                System.out.println(counter++);
////                System.out.println(link.size());
//            }
//            for (int j = 0; j < 2999; j++) {
//                link.removeInd((Math.abs(random.nextInt()))%size);
//                size--;
////                System.out.println(counter++);
////                System.out.println(link.size());
//            }
//
//        }
//        System.out.println(link.size());
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("That took " + (endTime - startTime) + " milliseconds");
//
//        java.util.LinkedList<Integer> link1 = new java.util.LinkedList<Integer>();
//        startTime = System.currentTimeMillis();
//
//        counter = 0;
//        for (int j = 0; j < 1000; j++) {
//            link1.add(random.nextInt());
////            System.out.println(counter++);
//        }
//
//        for (int i = 0; i < 1000; i++) {
//            int size = link.size() - 1;
//
//            for (int j = 0; j < 3000; j++) {
//                link1.add(Math.abs(random.nextInt() % link1.size()), random.nextInt());
////                System.out.println(size);
//                size++;
////                System.out.println(counter++);
////                System.out.println(link.size());
//            }
//            for (int j = 0; j < 2999; j++) {
//                link1.remove((Math.abs(random.nextInt()))% link1.size());
//                size--;
////                System.out.println(counter++);
////                System.out.println(link.size());
//            }
//
//        }
//        System.out.println(link.size());
//
//        endTime = System.currentTimeMillis();
//
//        System.out.println("That took " + (endTime - startTime) + " milliseconds");




    }
}
