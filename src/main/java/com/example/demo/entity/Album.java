package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Album {
    @Id
    private String id;
    private String albumImagePath;
    private Integer hitCount;
    private Boolean isFavourite;

    @ManyToOne
    private Studio studio;
}
