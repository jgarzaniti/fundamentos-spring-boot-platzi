package com.fudamentosplatzi.springboot.fundamentos;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication {

	public static void main(StringArrayPropertyEditor[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

}
