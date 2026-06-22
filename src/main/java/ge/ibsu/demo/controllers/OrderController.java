package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Order;
import ge.ibsu.demo.entities.OrderStatus;
import ge.ibsu.demo.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/search")
    public List<Order> searchOrders(
            @RequestParam String name,
            @RequestParam OrderStatus status) {
        return orderService.search(name, status);
    }

    @PostMapping("/giveorder")
    public Order addOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }
}
