package com.db.auto_trade.AutoTrade.Controller;

import com.db.auto_trade.AutoTrade.entity.Orders;
import com.db.auto_trade.AutoTrade.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    OrderService orderService;


    @PostMapping
    public Orders newOrder(@RequestBody Orders orders) {
        return orderService.createOrder(orders);
    }

    @GetMapping
    public Iterable<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id).orElseThrow(() -> new RuntimeException("Order was not found."));
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }

}
