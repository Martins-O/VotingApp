package com.martinso.votingapp.service;

import com.martinso.votingapp.data.model.UserDetails;
import com.martinso.votingapp.data.repository.UserDetailsRepository;
import com.martinso.votingapp.dto.CreateUserDetailsRequest;
import com.martinso.votingapp.dto.CreateUserDetailsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService{

    private final UserDetailsRepository repository;

    @Override
    public CreateUserDetailsResponse register(CreateUserDetailsRequest request) {
        UserDetails details = UserDetails.builder()
                .firstname(request.getFirstname()+" "+request.getMiddlename()+" "+request.getLastname())
                .email(request.getEmail())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .address(request.getAddress())
                .age(request.getAge())
                .username(request.getUsername())
                .NIN(request.getNIN())
                .VIN(request.getVIN())
                .gender(request.getGender())
                .createdAt(LocalDateTime.now())
                .build();

        UserDetails saved = repository.save(details);
        log.info("saved ->{}", saved);
        return getCreate();
    }

    private static CreateUserDetailsResponse getCreate(){
        CreateUserDetailsResponse response = new CreateUserDetailsResponse();
        response.setId(response.getId());
        response.setMessage("User details registered successfully");
        response.setSuccess(true);
        return response;
    }

    public List<CreateUserDetailsResponse> getAllUsers() {
        List<UserDetails> details = repository.findAll();

        return details.stream().map(this::mapToProductResponse)
                .collect(Collectors.toList());
    }

    private CreateUserDetailsResponse mapToProductResponse(UserDetails userDetail) {
        return CreateUserDetailsResponse.builder()
                .id(userDetail.getId())
                .fullname(userDetail.getFirstname()+" "+userDetail.getMiddlename()+" "+userDetail.getLastname())
                .build();
    }



}
