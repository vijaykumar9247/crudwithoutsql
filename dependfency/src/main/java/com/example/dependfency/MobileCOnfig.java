package com.example.dependfency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobileCOnfig {
	

	
	@Bean
    public Mobiles oneplusmethod() {
    	return new Oneplus();
    }
	@Bean
    public Mobiles iphonemethod() {
		System.out.println("printed");
    	return new Iphone();
    }
}
