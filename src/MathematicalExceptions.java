public class MathematicalExceptions {

        public static int division(int a, int b) throws ArithmeticException {
            int result = 0;
            try{
                result = a / b;
                //FileReader reader = new FileReader("file.txt");
                //Closing database here
            } catch(Exception exception){
                System.out.println("Division by zero is not allowed " + exception.getMessage());
            }finally {
                System.out.println("Closing Database");
            }
            return result;
        }

        public static void main(String[] args) {
            int output = division(10, 2);
            System.out.println(output);
        }
    }

