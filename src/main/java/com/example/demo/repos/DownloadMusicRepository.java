package com.example.demo.repos;

import com.example.demo.entity.DownloadMusic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadMusicRepository extends JpaRepository<DownloadMusic, String> {
}
