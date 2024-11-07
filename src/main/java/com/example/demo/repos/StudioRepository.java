package com.example.demo.repos;

import com.example.demo.entity.Studio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudioRepository extends JpaRepository<Studio, String> {
}
