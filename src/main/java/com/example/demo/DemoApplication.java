package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    @Qualifier("sourceJdbcTemplate")
    private NamedParameterJdbcTemplate sourceJdbcTemplate;

    @Autowired
    @Qualifier("targetJdbcTemplate")
    private NamedParameterJdbcTemplate targetJdbcTemplate;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            var res = sourceJdbcTemplate.queryForList("select * from bem_music.music", Map.of());
            System.out.println(res);
            // TODO: make transformation and insert to target db
        };
    }
}
