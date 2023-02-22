package com.martinso.votingapp.vote.data.repository;

import com.martinso.votingapp.vote.data.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
