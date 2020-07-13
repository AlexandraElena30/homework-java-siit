package com.siit.homeworks.homework15.cars.service;

import com.siit.homeworks.homework15.cars.domain.Order;
import com.siit.homeworks.homework15.cars.domain.Product;
import com.siit.homeworks.homework15.cars.repository.OrderDAOImpl;
import com.siit.homeworks.homework15.cars.repository.ProductDAOImpl;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws SQLException {
        ProductDAOImpl prd = new ProductDAOImpl();
        OrderDAOImpl ord = new OrderDAOImpl();
        Order newOrder;

        newOrder=ord.read(10203);
//        newOrder.setOrderNumber(9999);
//        newOrder.setComments("New added order");
//        ord.create(newOrder);
//        ord.update(9999,"Resolved");
//        //ord.delete(9999);

        Product newProduct;
        newProduct = prd.read("S12_1099");
//        prd.update("S12_1099", new BigDecimal(96.00));
//        newProduct.setProductCode("S99_9999");
//        newProduct.setBuyPrice(new BigDecimal(50.00));
//        prd.delete("S99_9999");
//        // prd.create(newProduct);
    }
}