package com.siit.homeworks.homework15.cars.repository;

import com.siit.homeworks.homework15.connection.DatabaseConnection;
import com.siit.homeworks.homework15.cars.domain.Order;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
public class OrderDAOImpl implements OrderDAO {

    @Override
    public void update(int id, String status) throws SQLException {

        String query = "Update orders set status=? where orderNumber=?";
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);

        stm.setString(1, status);
        stm.setString(2, "" + id);

        if (stm.executeUpdate() > 0) {
            System.out.println("Order Number " + id + " status has been changed to " + status);
        }
    }

    @Override
    public void delete(int id) throws SQLException {

        String query = "DELETE from orders where orderNumber=" + id;
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);

        if (stm.executeUpdate() > 0) {
            System.out.println("The row corresponding to " + id + "Order Number, was successfully deleted");
        }
    }

    @Override
    public void create(Order id) throws SQLException {
        String query = "INSERT INTO orders VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);

        stm.setInt(1, id.getOrderNumber());
        Date date = Date.valueOf(id.getOrderDate());
        stm.setDate(2, date);
        date = Date.valueOf(id.getRequiredDate());
        stm.setDate(3, date);
        date = Date.valueOf(id.getShippedDate());
        stm.setDate(4, date);
        stm.setString(5, id.getStatus());
        stm.setString(6, id.getComments());
        stm.setInt(7, id.getCustomerNumber());

        if (stm.executeUpdate() > 0) {
            System.out.println("Your Order Number " + id.getOrderNumber() + " was successfully added to orders table");
        }
    }

    @Override
    public Order read(int id) throws SQLException {
        Order ord;

        String query = "Select *  from orders where orderNumber=" + id;
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);
        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
            ord = new Order(rs.getInt("orderNumber"), rs.getString("comments"), rs.getInt("customerNumber"),
                    rs.getDate("orderDate").toLocalDate(), rs.getDate("requiredDate").toLocalDate(), rs.getDate("shippedDate").toLocalDate(), rs.getString("status"));

            System.out.println("Order with number " + ord.getOrderNumber() + " and customer number " + ord.getCustomerNumber() + " is currently " + ord.getStatus());

            return ord;
        }
        return null;
    }
}
