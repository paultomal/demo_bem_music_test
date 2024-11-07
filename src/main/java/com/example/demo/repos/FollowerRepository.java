package com.example.demo.repos;

import com.example.demo.entity.Follower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowerRepository extends JpaRepository<Follower, String> {
}
