package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DownloadPlayList {
    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "playlist_id")
    private PlayList playList;

    @ManyToOne
    @JoinColumn(name = "userdetails_id")
    private UserDetail userDetails;
}
