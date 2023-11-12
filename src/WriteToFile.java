import java.io.*;
import java.util.Scanner;

    public class WriteToFile {

        public static void main(String[] args) {
            File file = new File("src/readWrite.txt");

            if(!file.exists()){
                System.out.println("File does not exist");
                return;
            }

            try(BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(file));
                Scanner scanner = new Scanner(System.in)){
                String input;
                while(!(input = scanner.nextLine()).equals("eof")){
                    bufferedWriter.write(input + "\n");
                }
            } catch(IOException e){
                System.out.println("Could not read from file " + e.getMessage());
            }
        }
    }

