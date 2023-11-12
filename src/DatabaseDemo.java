import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

    public class DatabaseDemo {
        public static void main(String[] args) {

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/october_cohort", "root", "1234Reality@#");
                 Statement statement = connection.createStatement()) {

                statement.execute("CREATE TABLE IF NOT EXISTS cohort(name Text NOT NULL, email Text, location Text, age Int )");

                PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO cohort(name, email, location, age) VALUES(?, ?, ?, ?)");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your location: ");
                String location = scanner.nextLine();
                System.out.println("Please enter your age: ");
                int age = scanner.nextInt();

                insertStatement.setString(1, name);
                insertStatement.setString(2, email);
                insertStatement.setString(3, location);
                insertStatement.setInt(4, age);

                insertStatement.execute();

            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        }
    }








