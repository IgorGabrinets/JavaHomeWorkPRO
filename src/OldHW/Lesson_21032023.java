package OldHW;
import java.util.Arrays;
import java.util.Comparator;

public class Lesson_21032023 {
    public static void main(String[] args) {
        String[][] arr = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};
        Arrays.sort(arr, Comparator.comparing((String[] o) -> o[0]).thenComparing(o -> o[1]));
        for (String[] pair : arr) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
