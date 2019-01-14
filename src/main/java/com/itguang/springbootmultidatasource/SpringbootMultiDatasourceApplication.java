package com.itguang.springbootmultidatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class SpringbootMultiDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultiDatasourceApplication.class, args);

	}
}
