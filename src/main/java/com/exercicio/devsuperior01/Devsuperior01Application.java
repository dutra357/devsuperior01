package com.exercicio.devsuperior01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Devsuperior01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Devsuperior01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do pedido: ");
		int codigo = sc.nextInt();

		System.out.println("Digite o valor básico: ");
		double valorBase = sc.nextDouble();

		System.out.println("Digite o percentual de desconto: ");
		int desconto = sc.nextInt();

		System.out.println(codigo + ' ' + valorBase + ' ' + desconto);
	}
}
