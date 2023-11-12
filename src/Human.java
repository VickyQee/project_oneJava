public class Human extends LivingThings implements Living {
    public Human(String name, int age) {
        super(name, age);
    }

    public void move() {System.out.println(getName() + " walks");}
    public void eat() {System.out.println(getName() + " eats");}
    void speak() {System.out.println(getName() + " talks");}
    void sleep() {System.out.println(getName() + " sleeps");}
}

