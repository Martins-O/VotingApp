package com.martinso.votingapp.data.repository;

import com.martinso.votingapp.data.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
