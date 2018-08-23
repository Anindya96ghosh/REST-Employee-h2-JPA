package com.rest.hteoas.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rest.hteoas.practice.pojo.Employee;
import com.rest.hteoas.practice.service.ServiceImpl;

@SpringBootApplication
public class PracticeApplication {
	
//	@Autowired
//	Service service;
	//private static final Logger log=LoggerFactory.getLogger(PracticeApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ServiceImpl repository)
	{
		return (args) ->{
			repository.addNewEmployee(new Employee(101,"Anindya",55000));
			repository.addNewEmployee(new Employee(102,"Sayali",55000));
			repository.addNewEmployee(new Employee(103,"Mehek",55000));
			repository.addNewEmployee(new Employee(104,"Nishad",55000));
			repository.addNewEmployee(new Employee(105,"Drishti",55000));

		};
	}
}
