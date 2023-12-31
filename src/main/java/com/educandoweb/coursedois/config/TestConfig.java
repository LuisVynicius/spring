package com.educandoweb.coursedois.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.coursedois.entities.User;
import com.educandoweb.coursedois.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null,"a","b","c","d");
		User u2 = new User(null,"e","f","g","h");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}