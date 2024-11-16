package com.exercicio.devsuperior01;

import com.exercicio.devsuperior01.entity.Order;
import com.exercicio.devsuperior01.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Devsuperior01Application implements CommandLineRunner {

	private final OrderService orderService;
    public Devsuperior01Application(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(Devsuperior01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do pedido: ");
		int code = sc.nextInt();

		System.out.println("Digite o valor básico: ");
		Double base = sc.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		Double discount = sc.nextDouble();

		Order order = new Order(code, base, discount);
		System.out.println();

		var total = orderService.total(order);
		DecimalFormat formater = new DecimalFormat("#.00");

		System.out.println("---------------------------------");
		System.out.println("Código do pedido: " + order.getCode());
		System.out.println("Total: " + formater.format(total));
		System.out.println("---------------------------------");
	}
}
