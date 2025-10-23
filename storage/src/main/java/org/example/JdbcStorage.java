package org.example;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStorage implements Storage {

    @Override
    public void save(String data) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "user1", "pass")) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into teststorage(name) values(?)");
            preparedStatement.setString(1, data);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String retrieve(int id) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "user1", "pass")) {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from teststorage where id = ?");
            preparedStatement.setInt(1, id);
            boolean hasResult = preparedStatement.execute();

            return hasResult
                    ? preparedStatement.getResultSet().getString("name")
                    : "";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
