package com.hemnath.blog.repository;

import com.hemnath.blog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    @Query("SELECT C FROM Category c LEFT JOIN FETCH c.posts")
    List<Category> findAllWithPostCount();
}
