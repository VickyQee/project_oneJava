public class WordReversal {
        public static void printReversal(String s){
            String[] array = s.split(" ");

            for( int i = array.length-1; i>= 0; i--){
                System.out.print(array[i] + " ");
            }
        }

        public static void main(String[] args) {
            printReversal("How are you?");
        }
    }

