package Lesson_14022023_Home;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        String resultSentence = "Такой-то Person говорит";
        System.out.println(resultSentence);
    }

    public void talk() {
        String resultSentence = "Такой-то Person говорит";
        System.out.println(resultSentence);
    }

    class Main {
        public static void main(String[] args) {
            Person person = new Person();
            System.out.println(person);

            Person personOne = new Person("Igor", 40);
            System.out.println(personOne);
        }
    }
}


