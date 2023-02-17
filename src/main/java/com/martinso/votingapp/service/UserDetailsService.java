package com.martinso.votingapp.service;

import com.martinso.votingapp.data.model.UserDetails;
import com.martinso.votingapp.dto.CreateUserDetailsRequest;
import com.martinso.votingapp.dto.CreateUserDetailsResponse;
import com.martinso.votingapp.dto.request.LoginRequest;
import com.martinso.votingapp.dto.request.LoginResponse;

public interface UserDetailsService {
    CreateUserDetailsResponse register(CreateUserDetailsRequest request);
    LoginResponse UserLogin (LoginRequest request);
    UserDetails getUserById(Long userId);
}
