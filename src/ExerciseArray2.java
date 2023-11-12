import java.util.Scanner;
public class ExerciseArray2 {
        public static void main(String[] args) {
            String[] array = new String[10];
            Scanner scanner = new Scanner(System.in);
            String holder = "string";
            for( int i = 0; i < 10; i++ ){
                System.out.println("Please enter a string: ");
                array[i] = scanner.nextLine();
            }

            System.out.println(array[0]);
            System.out.println(array[4]);
            System.out.println(array[9]);
        }

}
