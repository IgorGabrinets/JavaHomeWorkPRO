package OldHW;

import java.util.Scanner;

public class Lesson07112022_2 {
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

    private static int getDigit(int number, int position) {
        int divisor = (int) Math.pow(10, position - 1);
        return (number / divisor) % 10;
    }
}

