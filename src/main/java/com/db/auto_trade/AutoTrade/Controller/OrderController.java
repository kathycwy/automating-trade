package com.db.auto_trade.AutoTrade.Controller;

import com.db.auto_trade.AutoTrade.Model.Order;
import com.db.auto_trade.AutoTrade.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    OrderService orderService;


    @PostMapping
    public Order newOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping
    public Iterable<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id).orElseThrow(() -> new RuntimeException("Order was not found."));
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }

}
