package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class PlayList {
    @Id
    private String id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "userdetails_id")
    private UserDetail userDetails;

    private String playlistImagePath;
    private Boolean isFavourite;
}
