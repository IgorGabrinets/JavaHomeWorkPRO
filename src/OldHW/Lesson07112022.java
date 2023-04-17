package OldHW;

    import java.util.Scanner;

    public class Lesson07112022 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число:");
            int a = scanner.nextInt();

            System.out.println("Введите второе число:");
            int b = scanner.nextInt();

            int sum = a + b;
            int diff = a - b;
            int mult = a * b;
            int div = b != 0 ? a / b : 0; // избегаем деления на 0

            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + diff);
            System.out.println("Произведение: " + mult);
            System.out.println("Частное: " + div);
        }
    }
