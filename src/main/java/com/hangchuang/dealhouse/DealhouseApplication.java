package com.hangchuang.dealhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hangchuang.dealhouse.mapper")
public class DealhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealhouseApplication.class, args);
	}
}
