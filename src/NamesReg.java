
    import java.util.Scanner;

    public class NamesReg {

        public String getAllNames(){
            String allNames = "";
            Scanner scanner = new Scanner(System.in);
            for( int i = 0; i <= 2; i++ ){
                System.out.printf("Enter %s name \n", (i+1));
                String input = scanner.nextLine();
                allNames += input + " ";
            }
            return allNames;
        }

        private String capitalizeFirstName(String s){
            String[] names = s.split(" ");
            String update = names[0].toUpperCase();
            return update + " " + names[1] + " " + names[2];
        }

        public String capitalizeFirstLetters(String s){
            String[] part = s.split(" ");
            String part1 = part[1];
            part1 = part1.substring(0).toUpperCase() + part1.substring(1).toLowerCase();
            String part2 = part[2];
            part2 = part2.substring(0).toUpperCase() + part2.substring(1).toLowerCase();
            String toCapitalize = part[0] + " " + part1 + " " + part2;
            return capitalizeFirstName(toCapitalize);
        }
    }

