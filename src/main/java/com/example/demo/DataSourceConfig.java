package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "sourceDataSource")
    public DataSource sourceDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://bem-group.ctgs0280mepl.ap-south-1.rds.amazonaws.com:5432/bem_music");
        dataSource.setUsername("bem_group");
        dataSource.setPassword("bem-group-2024");
        return dataSource;
    }

    @Bean(name = "targetDataSource")
    public DataSource targetDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://bem-group.ctgs0280mepl.ap-south-1.rds.amazonaws.com:5432/bem_music_dev");
        dataSource.setUsername("bem_group");
        dataSource.setPassword("bem-group-2024");
        return dataSource;
    }

    @Bean(name = "sourceJdbcTemplate")
    public JdbcTemplate sourceJdbcTemplate(@Qualifier("sourceDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "targetJdbcTemplate")
    public JdbcTemplate targetJdbcTemplate(@Qualifier("targetDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}

