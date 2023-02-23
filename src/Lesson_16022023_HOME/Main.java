package Lesson_16022023_HOME;

public class Main {
    public static void main(String[] args) {

        String[] number = {"111111", "121212", "131313"};

        Phone smartPhone = new SmartPhone();
        Phone ultraSmartPhone = new UltraSmartPhone();
        Phone notSmartPhone = new NotSmartPhone();

        call(smartPhone, number[0]);
        receiveCall(smartPhone, number[1]);

        call(ultraSmartPhone, number[1]);
        receiveCall(ultraSmartPhone, number[2]);

        call(notSmartPhone, number[2]);
        receiveCall(notSmartPhone, number[0]);
    }

    public static void call(Phone phone, String number) {
        phone.call(number);
    }

    public static void receiveCall(Phone phone, String number) {
        phone.receiveCall(number);
    }
}