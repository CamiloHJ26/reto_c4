
package com.example.Reto3Jeremy1.repository.Interface;

import com.example.Reto3Jeremy1.model.Order;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderInterface extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone);
    List<Order> findBySalesManId(Integer id);
    List<Order> findBySalesManIdAndStatus(Integer id, String status);
    List<Order> findByRegisterDayAndSalesManId(Date registerDay, Integer id);
}
