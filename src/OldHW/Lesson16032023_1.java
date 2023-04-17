package OldHW;
import java.util.ArrayList;
import java.util.HashMap;
public class Lesson16032023_1 {

        public static void main(String[] args) {
            int[] arr = {1,1,5,3,3,4,3,2,4,2,7,6,9,11,14,1,7,15,0,8};

            int[] uniqueArr = getUniqueElements(arr);
            System.out.println("Уникальные элементы:");
            printArray(uniqueArr);

            int[] repeatedArr = getRepeatedElements(arr);
            System.out.println("Элементы, которые встречаются хотя бы дважды:");
            printArray(repeatedArr);
        }

        private static int[] getUniqueElements(int[] arr) {
            ArrayList<Integer> uniqueList = new ArrayList<Integer>();
            HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
            }

            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (freqMap.get(element) == 1) {
                    uniqueList.add(element);
                }
            }

            int[] uniqueArr = new int[uniqueList.size()];
            for (int i = 0; i < uniqueArr.length; i++) {
                uniqueArr[i] = uniqueList.get(i);
            }

            return uniqueArr;
        }

        private static int[] getRepeatedElements(int[] arr) {
            ArrayList<Integer> repeatedList = new ArrayList<Integer>();
            HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
            }

            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (freqMap.get(element) >= 2 && !repeatedList.contains(element)) {
                    repeatedList.add(element);
                }
            }

            int[] repeatedArr = new int[repeatedList.size()];
            for (int i = 0; i < repeatedArr.length; i++) {
                repeatedArr[i] = repeatedList.get(i);
            }

            return repeatedArr;
        }

        private static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
