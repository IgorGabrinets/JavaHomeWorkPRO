package OldHW.Lesson_18042023;

import java.util.function.Function;

public class Lesson_18042023_1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 10;
        func = func.andThen(x -> x + 1);
        func = func.andThen(x -> x + 3);
        func = func.andThen(x -> x * 2);

        int result = func.apply(3);
        System.out.println(result);
    }
}
