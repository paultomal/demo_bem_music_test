package com.example.demo.repos;

import com.example.demo.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetail, String> {
}
