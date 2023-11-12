
import java.util.ArrayList;
import java.util.List;

    public class SuperSuperDemo extends SuperDemo{

        private String branch;
        private List<SuperDemo> superDemoCustomers;
        private static int count = 0;

        public SuperSuperDemo(String branch, String name){
            super(name);
            this.branch = branch;
            superDemoCustomers = new ArrayList<>();
            count++;
        }

        public SuperSuperDemo(String name){
            this("Lagos", name);
        }

        public String getBranch() {
            return branch;
        }

        public static int getCount(){
            return count;
        }

        @Override
        public void setAccountBalance(double accountBalance) {
            super.setAccountBalance(accountBalance);
        }

        public List<SuperDemo> getSuperDemoCustomers() {
            return superDemoCustomers;
        }

        public static void main(String[] args) {
            SuperSuperDemo demo = new SuperSuperDemo("Lagos", "David");
            System.out.println(SuperSuperDemo.count);
            System.out.println(getCount());

            SuperSuperDemo demo1 = new SuperSuperDemo("Lagos", "Michael");
            System.out.println(SuperSuperDemo.count);

            System.out.println(getCount());
            System.out.println(getCount());        System.out.println(getCount());
            System.out.println(getCount());
            System.out.println(getCount());

            SuperSuperDemo demo2 = new SuperSuperDemo("Lagos", "Michael");
            System.out.println(SuperSuperDemo.count);
            System.out.println(getCount());

            SuperSuperDemo demo3 = new SuperSuperDemo("Wiswom");
            System.out.println(SuperSuperDemo.count);
            System.out.println(getCount());

            demo.setAccountBalance(50000);
            System.out.println(demo);
        }
    }

