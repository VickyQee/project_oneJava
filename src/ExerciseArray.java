
public class ExerciseArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        int sum = 0;
        for( int i = 1; i <= 15; i++ ){
            array[i-1] = i;
        }
        for( int x: array ){
            sum += x;
        }
        System.out.println(sum);
    }
}

