package com.gnevanov.blog.repositories;

import com.gnevanov.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
