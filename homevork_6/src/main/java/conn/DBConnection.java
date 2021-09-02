package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/DB_homework";
            String password = "123456";
            String user = "postgres";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
