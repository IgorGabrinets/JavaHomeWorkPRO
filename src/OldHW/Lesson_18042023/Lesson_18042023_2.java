package OldHW.Lesson_18042023;
import java.util.function.Function;
public class Lesson_18042023_2 {
    public static void main(String[] args) {
            Function<Integer, Integer> factorial = n -> {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
                return result;
            };

            int n = 9;
            int result = factorial.apply(n);
            System.out.println("Factorial of " + n + " is " + result);
        }
    }

