package com.martinso.votingapp.data.repository;

import com.martinso.votingapp.data.model.Office;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}
