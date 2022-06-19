package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

// expose basic CRUD operations for Post Model
// Spring will load Post data from data.sql file into a database on app startup
public interface PostRepository extends JpaRepository<Post, Long> {

}
