package io.navan.tourofheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class})*/
public class TourofheroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourofheroesApplication.class, args);

	}

}
