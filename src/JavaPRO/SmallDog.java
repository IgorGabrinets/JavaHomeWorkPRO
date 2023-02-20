package JavaPRO;

public class SmallDog extends Dog {
    private String name;

    public void bark() {
        super.bark(); //call method from superclass Dod
        System.out.println("Small gav - gav");
    }
}
