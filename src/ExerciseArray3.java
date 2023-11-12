public class ExerciseArray3 {
        public static void main(String[] args) {
            String[] array = new String[10];
            String holder = "String";
            for( int i = 0; i < 10; i++ ){
                array[i] = holder + (i+1);
            }

            System.out.println(array[0]);
            System.out.println(array[4]);
            System.out.println(array[9]);
        }

}
