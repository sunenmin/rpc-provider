package com.viewscenes.netsupervisor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.viewscenes.netsupervisor.mapper")
public class RpcProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpcProviderApplication.class, args);
	}
}
