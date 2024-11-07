package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class PlayListMusic {
    @Id
    private String id;

    @ManyToMany
    @JoinTable(
            name = "playlist_music_music",
            joinColumns = @JoinColumn(name = "playlist_music_id"),
            inverseJoinColumns = @JoinColumn(name = "music_id")
    )
    private Set<Music> music;

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private PlayList playList;

    private Boolean isFavourite;
}
