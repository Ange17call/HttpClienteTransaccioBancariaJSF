package com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class HttpClienteApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HttpClienteApplication.class, args);
		//ApplicationContext context = SpringApplication.run(HttpClienteApplication.class, args);
		//TransaccionBancaria op=(TransaccionBancaria) context.getBean("transaccionBancaria",TransaccionBancaria.class);
		//op.realizarTransferencia("003", "004", 46);
		
	}
}
