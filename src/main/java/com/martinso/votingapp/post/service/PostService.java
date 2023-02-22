package com.martinso.votingapp.post.service;

import com.martinso.votingapp.post.dto.request.PostRequest;
import com.martinso.votingapp.post.dto.response.PostResponse;


public interface PostService {
    PostResponse createPost (PostRequest request);

}
