package com.example.demo.repos;

import com.example.demo.entity.SubGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubGenreRepository extends JpaRepository<SubGenre, String> {
}
