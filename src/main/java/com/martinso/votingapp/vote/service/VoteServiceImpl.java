package com.martinso.votingapp.vote.service;

import com.martinso.votingapp.vote.data.model.Vote;
import com.martinso.votingapp.vote.data.repository.VoteRepository;
import com.martinso.votingapp.vote.dto.request.VoteRequest;
import com.martinso.votingapp.vote.dto.response.VoteResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class VoteServiceImpl implements VoteService {

    private final VoteRepository repository;

    @Autowired
    public VoteServiceImpl(VoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public VoteResponse createVote(VoteRequest request) {
        Vote vote = new Vote();
        vote.setDetails(request.getDetails());
        vote.setPost(request.getPost());
        vote.setCreatedAt(LocalDateTime.now());
        Vote saved = repository.save(vote);
        log.info("saved -> {}", saved);
        return getVoteResponse(vote);
    }

    @Override
    public void deleteVoteById(Long voteId) {
        repository.deleteById(voteId);
    }

    private VoteResponse getVoteResponse(Vote vote){
        return VoteResponse.builder()
                .id(vote.getId())
                .message("Vote created successfully")
                .isSuccess(true)
                .code(HttpStatus.CREATED.value())
                .build();
    }
}
