package com.example.demo.repos;

import com.example.demo.entity.PlayListMusic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListMusicRepository extends JpaRepository<PlayListMusic, String> {
}
