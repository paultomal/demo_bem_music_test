package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DataMigrationService {

    @Autowired
    private JdbcTemplate sourceJdbcTemplate;

    @Autowired
    private JdbcTemplate targetJdbcTemplate;

    public void migrateData() {
        // Step 1: Read data from the source database
        String query = "SELECT id, name, value FROM source_table";
        List<Map<String, Object>> rows = sourceJdbcTemplate.queryForList(query);

        // Step 2: Transform the data (if necessary)
        for (Map<String, Object> row : rows) {
            // Example: Modify data (transform as required)
            String name = (String) row.get("name");
            String transformedName = name.toUpperCase();  // Simple transformation

            // Step 3: Insert the transformed data into the target database
            String insertQuery = "INSERT INTO target_table (name, value) VALUES (?, ?)";
            targetJdbcTemplate.update(insertQuery, transformedName, row.get("value"));
        }

        System.out.println("Data migration completed successfully.");
    }
}
