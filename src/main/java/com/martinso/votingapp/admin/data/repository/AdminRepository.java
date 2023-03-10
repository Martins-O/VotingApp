package com.martinso.votingapp.admin.data.repository;

import com.martinso.votingapp.admin.data.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
