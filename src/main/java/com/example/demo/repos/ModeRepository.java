package com.example.demo.repos;

import com.example.demo.entity.Mode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeRepository extends JpaRepository<Mode, String> {
}
