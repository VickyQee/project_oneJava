import java.sql.*;
import java.util.Scanner;

public class ProjectOne {
    public static void main(String[] args) throws SQLException {
        ProjectOne.createTable();
        ProjectOne.populateTable();
    }
    // Assuming the database URL, username, and password
    private static String url = "jdbc:mysql://localhost:3306//project_one";
    private static String username = "root";
    private static String password = "1234Reality@#";

    static void createTable() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306//project_one, root, 1234Reality@#");
             Statement statement = connection.createStatement()) {

            // Creating a table with lowercase column names
            statement.execute("CREATE TABLE IF NOT EXISTS createTable (name TEXT, email TEXT, age INTEGER, location TEXT, designation TEXT)");

        } catch (SQLException nw) {
            System.out.println(nw.getMessage());
        }
    }
    public static int populateTable() {
        int count = 0;
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_one, root, 1234Reality@#");
             PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO createTable(name, email, age, location, designation) VALUES(chidinma chuks,chuks242gmail.com,35,lagos,Java Student)");
             Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Please enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter your location: ");
                String location = scanner.nextLine();
                System.out.println("Please enter your designation: ");
                String designation = scanner.nextLine();


                insertStatement.setString(1, name);
                insertStatement.setString(2, email);
                insertStatement.setInt(3, age);
                insertStatement.setString(4, location);
                insertStatement.setString(5, designation);

                insertStatement.execute();
                count++;
            }
            System.out.println(count + " Details inserted successful. ");

        }
        catch (Exception nw) {
            System.out.println(nw.getMessage());
        }
        return count;
    }
}

