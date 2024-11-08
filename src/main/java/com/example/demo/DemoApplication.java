package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
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
            List<Map<String, Object>> rows = sourceJdbcTemplate.queryForList("select * from bem_music.music", Map.of());
            for (Map<String, Object> row : rows) {
                String sql = "INSERT INTO music (id) VALUES (:id)";
                MapSqlParameterSource parameters = new MapSqlParameterSource();
                parameters.addValue("id", row.get("oid"));
                targetJdbcTemplate.update(sql, parameters);
                log.info("inserted: {}", row.get("oid"));
            }
        };
    }
}
