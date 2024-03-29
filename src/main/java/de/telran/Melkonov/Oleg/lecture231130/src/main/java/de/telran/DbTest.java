package de.telran;

import java.sql.*;

public class DbTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // init database
        // get connection
        // select/update/...
        //Class.forName("org.h2.driver");
        String driverName = "org.h2.Driver"; //com.mysql.MySqlDriver
        String connUrl = "jdbc:h2:mem:db"; //localhost:6363:DB:username:password
        String createQuery = "CREATE TABLE Users (Id int primary key, name VARCHAR(255), email VARCHAR(255), age int)";
        String updateUsers = "Insert into Users (Id, name, age) values (1, 'John', 33)";
        String selectUsers = "Select * from Users";
        Class.forName(driverName);
        //DriverManager.registerDriver(new Driver());
        try (Connection connection = DriverManager.getConnection(connUrl)){
            Statement statement = connection.createStatement();
            statement.execute(createQuery);
            statement.executeUpdate(updateUsers);
            statement.executeUpdate(updateUsers);
            ResultSet resultSet = statement.executeQuery(selectUsers);
            while (resultSet.next()){
                int id = resultSet.getInt("Id");
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
                System.out.println(name);
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
