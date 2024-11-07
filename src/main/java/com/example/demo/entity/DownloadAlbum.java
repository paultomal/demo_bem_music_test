package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DownloadAlbum {
    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "album_id")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "userdetails_id")
    private UserDetail userDetails;
}
