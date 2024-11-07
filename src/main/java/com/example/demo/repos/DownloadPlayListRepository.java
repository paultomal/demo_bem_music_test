package com.example.demo.repos;

import com.example.demo.entity.DownloadPlayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadPlayListRepository extends JpaRepository<DownloadPlayList, String> {
}
