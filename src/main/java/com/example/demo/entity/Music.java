package com.example.demo.entity;

import com.example.demo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class Music {
    @Id
    private String id;
    private String name;
    private String bpm;
    private Double credit;
    private LocalDateTime publicationDate;
    private Integer hitCount;
    private String previewUrl;

    @ManyToMany
    @JoinTable(
            name = "music_genre",
            joinColumns = @JoinColumn(name = "music_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private Set<Genre> genre;

    @ManyToMany
    @JoinTable(
            name = "music_subgenres",
            joinColumns = @JoinColumn(name = "music_id"),
            inverseJoinColumns = @JoinColumn(name = "subgenre_id")
    )
    private Set<SubGenre> subGenres;

    @ManyToMany
    @JoinTable(
            name = "music_instruments",
            joinColumns = @JoinColumn(name = "music_id"),
            inverseJoinColumns = @JoinColumn(name = "instrument_id")
    )
    private Set<Instrument> instruments;

    @ManyToMany
    @JoinTable(
            name = "music_mode",
            joinColumns = @JoinColumn(name = "music_id"),
            inverseJoinColumns = @JoinColumn(name = "mode_id")
    )
    private Set<Mode> mode;

    @ManyToMany
    @JoinTable(
            name = "music_tag",
            joinColumns = @JoinColumn(name = "music_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tag;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    private Double duration;
    private String mpThreeFileName;
    private String mpThreePreviewUrl;
    private String aacFileName;
    private String aacPreviewUrl;
    private String waveformLink;
    private String preGeneratedWaveform;
}
