package com.martinso.votingapp.service;

import com.martinso.votingapp.data.model.Fullname;
import com.martinso.votingapp.data.model.UserDetails;
import com.martinso.votingapp.data.repository.UserDetailsRepository;
import com.martinso.votingapp.dto.CreateUserDetailsRequest;
import com.martinso.votingapp.dto.CreateUserDetailsResponse;
import com.martinso.votingapp.dto.request.LoginRequest;
import com.martinso.votingapp.dto.request.LoginResponse;
import com.martinso.votingapp.exception.UserDetailsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService{

    private final UserDetailsRepository repository;

    @Autowired
    public UserDetailsServiceImpl(UserDetailsRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateUserDetailsResponse register(CreateUserDetailsRequest request) {
                if(!request.getPassword().equals(request.getConfirmPassword())){
                    throw new UserDetailsException("Password mismatch");
                }
                String check = String.valueOf(repository.findUserByUsername(request.getUsername()));
                if(request.getUsername().equals(check))
                    throw new UserDetailsException("User name already exists");

        UserDetails details = UserDetails.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .middleName(request.getMiddleName())
                .email(request.getEmail())
                .password(request.getPassword())
                .confirmPassword(request.getConfirmPassword())
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
        log.info("saved ->{}", saved.toString());
        return getCreate(saved);
    }

    @Override
    public LoginResponse UserLogin(LoginRequest request) {
         Optional<UserDetails> checkUser = repository.findUserByUsername(request.getUsername());
        if (checkUser.isEmpty()) {
            throw new UserDetailsException("Please register or input correct username");
        }
        UserDetails confirmUser = checkUser.get();
        confirmUser.setPassword(request.getPassword());
        UserDetails saved = repository.save(confirmUser);
        log.info("saved -> {}", saved.toString());
        return getLoginResponse(saved);
    }


//    private static CreateUserDetailsResponse getCreate(){
//        CreateUserDetailsResponse response = new CreateUserDetailsResponse();
//        response.setId(response.getId());
//        response.setMessage("User details registered successfully");
//        response.setSuccess(true);
//        return response;
//    }
//
    @Override
    public UserDetails getUserById(Long userId) {
        return repository.findById(userId).orElseThrow(()->
            new UserDetailsException(String.format("User %s not found", userId))
        );
    }

    private CreateUserDetailsResponse getCreate(UserDetails userDetail) {
        CreateUserDetailsResponse response = new CreateUserDetailsResponse();
        response.setId(userDetail.getId());
        response.setMessage("User registered successfully");
        response.setCode(HttpStatus.CREATED.value());
        response.setSuccess(true);
        response.setFullname(Fullname.builder()
                .firstName(userDetail.getFirstName())
                .lastName(userDetail.getLastName())
                .middleName(userDetail.getMiddleName())
                .build());
        return response;
    }
    private LoginResponse getLoginResponse(UserDetails userDetail){
        return LoginResponse.builder()
                .code(HttpStatus.CREATED.value())
                .message("Login successful")
                .isSuccess(true)
                .build();
    }



}
