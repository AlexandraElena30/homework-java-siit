package com.siit.homeworks.homework15.cars.repository;

import com.siit.homeworks.homework15.cars.domain.Order;
import com.siit.homeworks.homework15.cars.domain.Product;
import com.siit.homeworks.homework15.connection.DatabaseConnection;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public void update(String id, BigDecimal newPrice) throws SQLException {
        String query = "Update products set buyPrice=? where productCode=?";
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);

        stm.setString(1, String.valueOf(newPrice));
        stm.setString(2, "" + id);

        if (stm.executeUpdate() > 0) {
            System.out.println("Product " + id + " price has been changed to " + newPrice);
        }
    }

    @Override
    public void delete(String id) throws SQLException {
        String query = "DELETE from products where productCode='" + id + "'";
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);


        if (stm.executeUpdate() > 0) {
            System.out.println("The row corresponding to " + id + "Product Code, was successfully deleted");
        }
    }

    @Override
    public void create(Product id) throws SQLException {
        String query = "INSERT INTO products VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);

        stm.setString(1, id.getProductCode());
        stm.setString(2, id.getProductName());
        stm.setString(3, id.getProductLine());
        stm.setString(4, id.getProductScale());
        stm.setString(5, id.getProductVendor());
        stm.setString(6, id.getProductDescription());
        stm.setShort(7, id.getQuantityInStock());
        stm.setBigDecimal(8, id.getBuyPrice());
        stm.setBigDecimal(9, id.getMSRP());

        if (stm.executeUpdate() > 0) {
            System.out.println("Your Product with Code " + id.getProductCode() + " was successfully added to orders table");
        }
    }

    @Override
    public Product read(String id) throws SQLException {
        Product prd;
        String query = "Select *  from products where productCode='" + id + "'";
        PreparedStatement stm = DatabaseConnection.getPreparedStatement(query);
        ResultSet rs = stm.executeQuery();

        if (rs.next()) {

            prd = new Product(rs.getString("productCode"), rs.getString("productName"), rs.getString("productLine"),
                    rs.getString("productScale"), rs.getString("productVendor"), rs.getString("productDescription"),
                    rs.getShort("quantityInStock"), rs.getBigDecimal("buyPrice"), rs.getBigDecimal("MSRP"));

            System.out.println("Product with code " + prd.getProductCode() + " has price " + prd.getBuyPrice());

            return prd;
        }
        return null;
    }
}
