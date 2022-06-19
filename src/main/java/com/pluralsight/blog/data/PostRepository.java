package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// expose basic CRUD operations for Post Model
public interface PostRepository extends JpaRepository<Post, Long> {

}
