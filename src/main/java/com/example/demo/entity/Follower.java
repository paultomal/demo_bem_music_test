package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Follower {
    @Id
    private String id;
    @ManyToOne
    private Studio studio;
    @ManyToOne
    private UserDetail userDetails;
}
