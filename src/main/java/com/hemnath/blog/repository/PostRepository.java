package com.hemnath.blog.repository;

import com.hemnath.blog.entity.Post;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Registered
public interface PostRepository extends JpaRepository<Post, UUID> {
}
