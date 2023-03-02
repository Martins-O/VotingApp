package com.martinso.votingapp.post.service;

import com.martinso.votingapp.post.dto.request.PostRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostServiceImplTest {

    @Autowired
    private PostService service;

    @Test
    void createPost() {
//        PostRequest request = new PostRequest();
//        request.setRunningPost("");
    }
}