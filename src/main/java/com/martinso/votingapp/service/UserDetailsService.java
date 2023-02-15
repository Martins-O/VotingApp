package com.martinso.votingapp.service;

import com.martinso.votingapp.dto.CreateUserDetailsRequest;
import com.martinso.votingapp.dto.CreateUserDetailsResponse;

public interface UserDetailsService {
    CreateUserDetailsResponse register(CreateUserDetailsRequest request);
}
