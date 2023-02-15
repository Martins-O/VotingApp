package com.martinso.votingapp.data.repository;

import com.martinso.votingapp.data.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
}
