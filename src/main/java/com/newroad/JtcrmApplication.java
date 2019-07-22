package com.newroad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//解除自动加载DataSourceAutoConfiguration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JtcrmApplication {
    public static void main(String[] args) {

        SpringApplication.run(JtcrmApplication.class, args);
    }

}
