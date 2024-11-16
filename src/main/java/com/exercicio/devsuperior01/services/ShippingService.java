package com.exercicio.devsuperior01.services;

import com.exercicio.devsuperior01.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment (Order order) {
        double base = order.getBasic();
        if (base < 100) {
            return 20.0;
        } else if (base >= 100.0 && base <= 200.0) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
