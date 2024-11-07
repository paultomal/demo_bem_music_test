package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DownloadMusic {
    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "music_id")
    private Music music;

    @ManyToOne
    @JoinColumn(name = "userdetails_id")
    private UserDetail userDetails;
}
