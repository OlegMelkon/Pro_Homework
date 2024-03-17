package de.telran.Melkonov.Oleg.hw20231128;

import java.sql.*;

public class PhoneDAO {
    public static void main(String[] args) throws ClassNotFoundException {
        String driverName = "org.h2.Driver";
        String connUrl = "jdbc:h2:mem:db";
        String createQuery = "CREATE TABLE Users (Id int primary key, name VARCHAR(255), email VARCHAR(255), age int)";
        String updateUsers = "Insert into Users (Id, name, age) values (1, 'John', 33)";
        String selectUsers = "Select * from Users";
        Class.forName(driverName);
        try (Connection connection = DriverManager.getConnection(connUrl)){
            Statement statement = connection.createStatement();
            statement.execute(createQuery);
            statement.executeUpdate(updateUsers);
            ResultSet resultSet = statement.executeQuery(selectUsers);
            if (resultSet.next()){
                int id = resultSet.getInt("Id");
                int age = resultSet.getInt("age");
                String name = resultSet.getString("name");
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
