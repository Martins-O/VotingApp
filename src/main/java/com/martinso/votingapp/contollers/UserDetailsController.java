package com.martinso.votingapp.contollers;

import com.martinso.votingapp.dto.CreateUserDetailsRequest;
import com.martinso.votingapp.dto.CreateUserDetailsResponse;
import com.martinso.votingapp.service.UserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/users")
@RequiredArgsConstructor
public class UserDetailsController {

    private final UserDetailsService service;

    @PostMapping("/resgister")
    public ResponseEntity<? > register(@RequestBody CreateUserDetailsRequest request){
        CreateUserDetailsResponse response = service.register(request);
    }

}
