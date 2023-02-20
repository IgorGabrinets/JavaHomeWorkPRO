package Lesson_14022023_Home;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall() {
        String callingName;
        System.out.println("Звонит {name}");
}
public void getNumber(){
        int number;
    return number;
}
class main{
    public static void main(String[] args) {
        Phone phoneOne = new Phone(111, "Q100", 300);
        Phone phoneTwo = new Phone(222, "W200", 350);
        Phone phoneThree = new Phone(333, "E300", 400);
        System.out.println(phoneOne);
        System.out.println(phoneTwo);
        System.out.println(phoneThree);

    }


    }
}
