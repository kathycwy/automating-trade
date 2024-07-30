package com.db.auto_trade.AutoTrade.Service;

import com.db.auto_trade.AutoTrade.entity.Orders;
import com.db.auto_trade.AutoTrade.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders createOrder(Orders orders) {
        return orderRepository.save(orders);
    }

    public Iterable<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Orders> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public void deleteOrder(Long id) {
        Orders orders = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order could not be found!"));
        orderRepository.delete(orders);
    }
}
