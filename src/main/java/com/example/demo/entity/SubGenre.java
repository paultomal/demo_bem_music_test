package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class SubGenre {
    @Id
    private String id;
    private String name;
    @ManyToOne
    private Genre genre;
}
