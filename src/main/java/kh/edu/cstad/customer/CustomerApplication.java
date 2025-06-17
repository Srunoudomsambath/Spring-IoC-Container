package kh.edu.cstad.customer;

import kh.edu.cstad.customer.bean.AnnotationBaseConfig;
import kh.edu.cstad.customer.bean.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public abstract class CustomerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}



	// Define Dependency (required)
	private final AnnotationBaseConfig config;
	private final List<Student> student;
	// DI by Constructor
	public CustomerApplication(AnnotationBaseConfig config,List<Student> student) {
		this.config = config;
		this.student = student;
	}

	//DI by setter (optional)
	@Override
	public void run(String... args) throws Exception {
		System.out.println(config.getStudent());
	}


}
