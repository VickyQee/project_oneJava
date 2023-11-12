public class ThisDemo {

        private String name;
        private int age;
        private double accountBalance;

        public ThisDemo(String name, int age, double accountBalance){
            this.name = name;
            this.age = age;
            this.accountBalance = accountBalance;
        }

        public ThisDemo(String name, int age){
            this(name, age, 0.0);
        }

        public ThisDemo(String name){
            this(name, 18);
        }

        public ThisDemo(){
            this("Dein");
        }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }

        public void setAge(int age) { this.age = age; }

        public double getAccountBalance() { return accountBalance; }

        public void setAccountBalance(double accountBalance) { this.accountBalance = accountBalance; }

        public String toString(){
            return "Name: " + getName() + " Age: " + getAge() + " Account Balance: " + getAccountBalance();
        }

        public static void main(String[] args) {
            ThisDemo demo = new ThisDemo();
            ThisDemo demo1 = new ThisDemo("Mustapha");
            ThisDemo demo2 = new ThisDemo("Mustapha Dein", 29);
            ThisDemo demo3 = new ThisDemo("Mustapha J", 35, 35000000);
            System.out.println(demo);
            System.out.println(demo1);
            System.out.println(demo2);
            System.out.println(demo3);
        }
    }

