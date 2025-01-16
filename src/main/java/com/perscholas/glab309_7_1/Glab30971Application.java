package com.perscholas.glab309_7_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.perscholas.glab309_7_1.repository")
@EntityScan("com.perscholas.glab309_7_1.model")
public class Glab30971Application {

    public static void main(String[] args) {
        SpringApplication.run(Glab30971Application.class, args);
    }

}
