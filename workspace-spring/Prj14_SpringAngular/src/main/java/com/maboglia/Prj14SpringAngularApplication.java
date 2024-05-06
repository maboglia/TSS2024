package com.maboglia;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.maboglia.entities.User;
import com.maboglia.repos.UserRepository;

@SpringBootApplication
public class Prj14SpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj14SpringAngularApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository repo) {
		return args -> {
			Stream
				.of("galileo", "newton", "einstein", "curie")
				.forEach(scienziato -> {
					User user = new User();
					user.setUsername(scienziato);
					user.setEmail(scienziato+"@immaginazioneelavoro.it");
					repo.save(user);
				});
				repo.findAll().forEach(System.out::println);
			
		};
	} 
	
}
