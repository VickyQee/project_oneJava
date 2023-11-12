     public class Horse extends LivingThings implements Living {
        public Horse(String name, int age) {
            super(name, age);
        }

        public void move() {System.out.println(getName() + " gallops");}
        public void eat() {System.out.println(getName() + " is chewing");}
        void speak() {System.out.println(getName() + " is neighing");}
        void sleep() {System.out.println(getName() + " is sleeping");}
    }

