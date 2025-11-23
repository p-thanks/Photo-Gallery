package com.example.Photo_Gallary.repository;

import com.example.Photo_Gallary.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Image,Long> {
}
