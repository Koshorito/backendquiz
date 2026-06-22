package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Order;
import ge.ibsu.demo.entities.OrderStatus;
import ge.ibsu.demo.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

   public OrderService(OrderRepository orderRepository){
       this.orderRepository = orderRepository;
   }
    public List<Order> search(String name, OrderStatus status) {
        return orderRepository.searchOrders(name, status);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
