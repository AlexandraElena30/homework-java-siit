package com.siit.homeworks.homework15.cars.repository;

import com.siit.homeworks.homework15.cars.domain.Order;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO {

    void update(int id, String status) throws SQLException;

    void delete(int id) throws SQLException;

    void create(Order id) throws SQLException;

    Order read(int id) throws SQLException;
}
