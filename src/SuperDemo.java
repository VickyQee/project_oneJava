public class SuperDemo extends ThisDemo{
        private final String accountType;
        private final double[] loans;
        private final int loanCount = 10;

        public SuperDemo(String name, int age, double accountBalance, String accountType){
            super(name, age, accountBalance);
            this.accountType = accountType;
            loans = new double[loanCount];
        }

        public SuperDemo(String name, int age){
            super(name, age);
            this.accountType = "Savings";
            loans = new double[loanCount];
        }

        public SuperDemo(String name){
            super(name);
            this.accountType = "Savings";
            loans = new double[loanCount];
        }

        public String getAccountType() {
            return accountType;
        }

        public double[] getLoans() {
            return loans;
        }

        @Override
        public void setAccountBalance(double accountBalance) {
            super.setAccountBalance(accountBalance + 50000);
        }

        public int getLoanCount() {
            return loanCount;
        }

        public static void main(String[] args) {
            SuperDemo demo1 = new SuperDemo("Mike");
            System.out.println("Name: " + demo1.getName() + " Age: " + demo1.getAge() + " Account Balance: "
                    + demo1.getAccountBalance() + " No. of available loans: " + demo1.getLoanCount());

        }
    }
