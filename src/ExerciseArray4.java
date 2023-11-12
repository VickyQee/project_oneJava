public class ExerciseArray4 {
        public static void main(String[] args) {
            String first = "Java";
            String holder = "String";

            String concatenated = first.concat("," + holder);
            System.out.println(concatenated);
            String[] split = concatenated.split(",");
            for (String x : split) {
                System.out.println(x);
            }
        }

}
