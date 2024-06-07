package com.compass.backend.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.compass.backend.entities.Categoria;
import com.compass.backend.entities.Order;
import com.compass.backend.entities.User;
import com.compass.backend.entities.enums.OrderStatus;
import com.compass.backend.repositories.CategoriaRepository;
import com.compass.backend.repositories.OrderRepository;
import com.compass.backend.repositories.UserRepository;


@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRespository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Electronics");
		Categoria cat2 = new Categoria(null, "Books");
		Categoria cat3 = new Categoria(null, "Computers");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATTING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WATTING_PAYMENT, u1);
		
		userRespository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
