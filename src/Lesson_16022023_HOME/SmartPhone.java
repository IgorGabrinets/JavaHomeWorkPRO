package Lesson_16022023_HOME;

public class SmartPhone extends Phone {


    String name = "SmartPhone";


    @Override
    public void call(String number) {
        super.call(number);
        System.out.println("Phone " + name + "call to " + number);

    }

    @Override
    public void receiveCall(String number) {
        super.receiveCall(number);
        System.out.println("Phone " + name + "receive call from " + number);

    }
}




