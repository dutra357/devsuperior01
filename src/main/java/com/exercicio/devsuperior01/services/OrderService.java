package com.exercicio.devsuperior01.services;

import com.exercicio.devsuperior01.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;
    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total (Order order) {
        var discount = (order.getDiscount() > 0) ? (1 - order.getDiscount()/100) : 1;

        return (order.getBasic() * discount) + shippingService.shipment(order);
    }
}
