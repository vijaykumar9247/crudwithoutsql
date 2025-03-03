package com.example.dependfency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependfencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependfencyApplication.class, args);
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MobileCOnfig.class);
		
		Mobiles m=context.getBean("oneplusmethod", Mobiles.class);
		
		m.getmodel();
		
		
		
	}

}
