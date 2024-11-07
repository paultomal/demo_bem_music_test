package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Studio {
    @Id
    private String id;
    private String name;
    private String facebookLink;
    private String instagramLink;
    private String studioImagePath;
    private Integer hitCount;
}
