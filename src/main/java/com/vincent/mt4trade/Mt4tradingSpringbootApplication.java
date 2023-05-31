package com.vincent.mt4trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

public class Mt4tradingSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Mt4tradingSpringbootApplication.class, args);
    }

}
