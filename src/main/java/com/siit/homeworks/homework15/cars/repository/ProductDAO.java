package com.siit.homeworks.homework15.cars.repository;


import com.siit.homeworks.homework15.cars.domain.Product;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface ProductDAO {
    void update(String id, BigDecimal newPrice) throws SQLException;

    void delete(String id) throws SQLException;

    void create(Product id) throws SQLException;

    Product read(String id) throws SQLException;
}
