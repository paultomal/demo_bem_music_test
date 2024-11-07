package com.example.demo.repos;

import com.example.demo.entity.PlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayListRepository extends JpaRepository<PlayList, String> {
}