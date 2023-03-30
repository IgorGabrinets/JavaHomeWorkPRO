package Lesson_09032023_HOME;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;

public class Lesson_09032023_H {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        int temp;
        long time;

        for (int i = 0; i < 11000000; i++) {
            integerList.add(i);
        }

        // for-each loop
        time = System.currentTimeMillis();
        for (Integer integer : integerList) {
            temp = integer;
        }
        System.out.println("For-each loop: " + (System.currentTimeMillis() - time) + " ms");

        // classic for loop with list.size()
        time = System.currentTimeMillis();
        for (int i = 0; i < integerList.size(); i++) {
            integerList.size();
        }
        System.out.println("Classic 'for' loop with list.size(): " + (System.currentTimeMillis() - time) + " ms");

        // classic for loop with size in variable
        int size = integerList.size();
        time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            temp = integerList.get(i);
        }
        System.out.println("Classic 'for' loop with size variable: " + (System.currentTimeMillis() - time) + " ms");

        // classic for loop with size in variable and iterating backwards
        size = integerList.size();
        time = System.currentTimeMillis();
        for (int i = size - 1; i >= 0; i--) {
            temp = integerList.get(i);
        }
        System.out.println("Classic 'for' loop with size variable and iterating backwards: " + (System.currentTimeMillis() - time) + " ms");

        // using Iterator
        Iterator<Integer> iterator = integerList.iterator();
        time = System.currentTimeMillis();
        while (iterator.hasNext()) {
            temp = iterator.next();
        }
        System.out.println("Iterator: " + (System.currentTimeMillis() - time) + " ms");

        // using ListIterator
        ListIterator<Integer> listIterator = integerList.listIterator();
        time = System.currentTimeMillis();
        while (listIterator.hasNext()) {
            temp = listIterator.next();
        }
        System.out.println("ListIterator: " + (System.currentTimeMillis() - time) + " ms");
    }
}