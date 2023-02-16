package com.martinso.votingapp.contollers;

import com.martinso.votingapp.dto.CreateUserDetailsRequest;
import com.martinso.votingapp.dto.CreateUserDetailsResponse;
import com.martinso.votingapp.service.UserDetailsService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/vi/users")
public class UserDetailsController {

    private final UserDetailsService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid CreateUserDetailsRequest request){
        CreateUserDetailsResponse response = service.register(request);
        return ResponseEntity.ok().body(response);
    }


}
