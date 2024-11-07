package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "sourceDataSource")
    public DataSource sourceDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://bem-group.ctgs0280mepl.ap-south-1.rds.amazonaws.com:5432/bem");
        dataSource.setUsername("bem_group");
        dataSource.setPassword("bem-group-2024");
        return dataSource;
    }

    @Primary
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
    public NamedParameterJdbcTemplate sourceJdbcTemplate(@Qualifier("sourceDataSource") DataSource dataSource) {
        return new NamedParameterJdbcTemplate(new JdbcTemplate(dataSource));
    }

    @Primary
    @Bean(name = "targetJdbcTemplate")
    public NamedParameterJdbcTemplate targetJdbcTemplate(@Qualifier("targetDataSource") DataSource dataSource) {
        return new NamedParameterJdbcTemplate(new JdbcTemplate(dataSource));
    }
}

