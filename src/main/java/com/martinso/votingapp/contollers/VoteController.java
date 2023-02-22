package com.martinso.votingapp.contollers;

import com.martinso.votingapp.vote.dto.request.VoteRequest;
import com.martinso.votingapp.vote.dto.response.VoteResponse;
import com.martinso.votingapp.vote.service.VoteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/vote")
public class VoteController {

    private final VoteService service;

    @Autowired
    public VoteController(VoteService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody VoteRequest request){
        VoteResponse response = service.createVote(request);
        return ResponseEntity.ok().body(response);
    }
}
