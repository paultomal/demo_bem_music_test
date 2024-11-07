package com.example.demo.repos;

import com.example.demo.entity.DownloadAlbum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadAlbumRepository extends JpaRepository<DownloadAlbum, String> {
}
