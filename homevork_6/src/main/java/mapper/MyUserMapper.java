package mapper;

import conn.DBConnection;
import entity.MyUser;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyUserMapper {
    private final DBConnection connection;

    public MyUserMapper(DBConnection connection) {
        this.connection = connection;
    }

    public MyUser findById(int id) throws SQLException {
        PreparedStatement statement= connection.connect().prepareStatement("SELECT name, password, age, status from \"DB_homework\".test_schema.homework_6 where id = ?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()){
            return null;
        }
      return new MyUser(resultSet.getString("name"),resultSet.getString("password"),resultSet.getInt("age"),resultSet.getBoolean("status"));
    }

    public MyUser findByName(String name) throws SQLException {
        PreparedStatement statement= connection.connect().prepareStatement("SELECT name, password, age, status from \"DB_homework\".test_schema.homework_6 where name= ?");
        statement.setString(1, name);
        ResultSet resultSet = statement.executeQuery();
        if (!resultSet.next()){
            return null;
        }
        return new MyUser(resultSet.getString("name"),resultSet.getString("password"),resultSet.getInt("age"),resultSet.getBoolean("status"));
    }

    public List<MyUser> findAll() throws SQLException {
        List<MyUser> result = new ArrayList<>();
        Statement statement = connection.connect().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from \"DB_homework\".test_schema.homework_6");
        while (resultSet.next()) {
            MyUser myUser = new MyUser(resultSet.getString("name"), resultSet.getString("password"), resultSet.getInt("age"), resultSet.getBoolean("status"));
            System.out.println(myUser);
            result.add(myUser);
        }
        return result;
    }
    public void insert(MyUser user) throws SQLException {
        PreparedStatement statement= connection.connect().prepareStatement("INSERT into \"DB_homework\".test_schema.homework_6 values (?,?,?,?)");
        statement.setString(1, user.getName());
        statement.setString(2, user.getPassword());
        statement.setInt(3,user.getAge());
        statement.setBoolean(4,user.getStatus());
        int rows = statement.executeUpdate();
        System.out.println("Update "+rows+" rows");
    }
}

