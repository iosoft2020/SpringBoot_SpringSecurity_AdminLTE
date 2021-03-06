package com.iosoft2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients(basePackages = "com.iosoft2020.fein")
@MapperScan("com.iosoft2020.mapper")
public class Module1Application {

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}

}
