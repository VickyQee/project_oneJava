import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class DatabaseTest {
        public static void main(String[] args) {

            Connection connection = null;
            String url = "jdbc:mysql://127.0.0.1:3306/october_cohort";
            String username = "root";
            String password = "1234Reality@#";
            try{
                connection = DriverManager.getConnection(url, username, password);
                Statement statement = connection.createStatement();

                String create = "CREATE TABLE IF NOT EXISTS users(name Text, email Text, age Integer, password Text)";
                statement.execute(create);
                String insert = String.format("INSERT INTO users(name, email, age, password) VALUES('%s', '%s', %d, '%s')", "Davidson Akinade", "ade@gmail.com", 35, "password");
                String insert1 = "INSERT INTO users(name, email, age, password) VALUES(\"Victoria Chuks\", \"chuks@gmail.com\", 30, \"password1\")";
                statement.execute(insert);
                statement.execute(insert1);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally{
                try{
                    if( connection != null ){
                        connection.close();
                    }
                } catch (SQLException exception){
                    System.out.println(exception.getMessage());
                }
            }

        }
    }

