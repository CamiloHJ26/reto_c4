
package com.example.Reto3Jeremy1.repository;

import com.example.Reto3Jeremy1.model.Order;
import com.example.Reto3Jeremy1.repository.Interface.OrderInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class OrderRepository {
    @Autowired
    private OrderInterface orderInterface;
    
    public List<Order> getAll(){
        return orderInterface.findAll();
    }
    
    public Optional<Order> getOrder(Integer id){
        return orderInterface.findById(id);
    }
    
    public Order create(Order order){
        return orderInterface.save(order);
    }
    
    public void update(Order order){
        orderInterface.save(order);
    }
    
    public void delete(Order order){
        orderInterface.delete(order);
    }
    
    public List<Order> getZone(String zone){
        return orderInterface.findBySalesManZone(zone);
    }

    public List<Order> getBySalesManId(Integer id){
        return orderInterface.findBySalesManId(id);
    }

    public List<Order> getBySalesManIdAndStatus(Integer id, String status){
        return orderInterface.findBySalesManIdAndStatus(id, status);
    }

    public List<Order> getByRegisterDayAndSalesManId(String registerDay, Integer id){
        try {
            return orderInterface.findByRegisterDayAndSalesManId(new SimpleDateFormat("yyyy-MM-dd").parse(registerDay), id);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


}
