package OldHW;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Lesson07112022_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите трехзначное число:");
        int number = scanner.nextInt();

        int digit1 = getDigit(number, 1);
        int digit2 = getDigit(number, 2);
        int digit3 = getDigit(number, 3);

        System.out.println("Первая цифра: " + digit1);
        System.out.println("Вторая цифра: " + digit2);
        System.out.println("Третья цифра: " + digit3);
    }


    public static class MainTest {

        @Test
        public void testGetDigit() {
            assertEquals(1, Lesson07112022_3.getDigit(123, 1));
            assertEquals(2, Lesson07112022_3.getDigit(123, 2));
            assertEquals(3, Lesson07112022_3.getDigit(123, 3));
            assertEquals(3, Lesson07112022_3.getDigit(903, 1));
            assertEquals(0, Lesson07112022_3.getDigit(903, 2));
            assertEquals(9, Lesson07112022_3.getDigit(903, 3));
        }
    }


    private static int getDigit(int number, int position) {
        int divisor = (int) Math.pow(10, position - 1);
        return (number / divisor) % 10;
    }

}


