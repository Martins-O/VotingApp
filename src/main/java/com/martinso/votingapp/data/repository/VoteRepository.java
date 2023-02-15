package com.martinso.votingapp.data.repository;

import com.martinso.votingapp.data.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
