package com._dev_ruan.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com._dev_ruan.workshopmongo.domain.User;
import com._dev_ruan.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria", "maria@Gmail.com");
		User alex = new User(null, "alex", "alex@Gmail.com");
		User jose = new User(null, "jose", "jose@Gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria,jose,alex));
		
		
		
	}

}
