package com.martinso.votingapp.data.repository;

import com.martinso.votingapp.data.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepository extends JpaRepository<Election, Long> {
}
