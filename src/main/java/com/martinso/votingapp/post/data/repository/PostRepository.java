package com.martinso.votingapp.post.data.repository;

import com.martinso.votingapp.post.data.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
