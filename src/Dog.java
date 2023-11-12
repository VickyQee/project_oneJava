public class Dog extends Animals{
    public Dog(String name, int numberOfLegs) {
        super(name, numberOfLegs);
    }

    public void speak() {
        System.out.println(getName() + " barks");
    }
}

