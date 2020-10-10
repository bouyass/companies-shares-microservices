package com.lyes;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lyes.dao.CompanyRepository;
import com.lyes.entities.Company;

@SpringBootApplication
public class ServiceCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCompanyApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args -> {
			Stream.of("A","B","C").forEach(comp -> {
				companyRepository.save(new Company(null, comp, 100+Math.random()*900));
			});
			companyRepository.findAll().forEach(System.out::println);
		};
	}

}
