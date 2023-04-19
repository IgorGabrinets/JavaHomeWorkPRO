package OldHW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    private static Map<String, String> dictionary = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите слово на английском языке: ");
            String word = scanner.nextLine();

            if (dictionary.containsKey(word)) {
                System.out.println("Перевод: " + dictionary.get(word));
            } else {
                System.out.println("Слово не найдено в словаре. Введите перевод: ");
                String translation = scanner.nextLine();
                dictionary.put(word, translation);
                System.out.println("Слово \s" + word + "\s сохранено в словаре с переводом \s" + translation + "\s");
            }
        }
    }
}
