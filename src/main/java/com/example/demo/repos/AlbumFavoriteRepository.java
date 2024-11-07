package com.example.demo.repos;

import com.example.demo.entity.AlbumFavorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumFavoriteRepository extends JpaRepository<AlbumFavorite, String> {
}
