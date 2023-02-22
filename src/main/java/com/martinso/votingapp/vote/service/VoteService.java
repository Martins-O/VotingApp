package com.martinso.votingapp.vote.service;

import com.martinso.votingapp.post.dto.response.PostResponse;
import com.martinso.votingapp.vote.dto.request.VoteRequest;
import com.martinso.votingapp.vote.dto.response.VoteResponse;

public interface VoteService {

    VoteResponse createVote(VoteRequest request);

    void deleteVoteById(Long id);
}
