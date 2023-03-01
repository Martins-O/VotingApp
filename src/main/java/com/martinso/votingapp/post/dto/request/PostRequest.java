package com.martinso.votingapp.post.dto.request;

import com.martinso.votingapp.election.data.model.Election;
import com.martinso.votingapp.office.data.model.Office;
import com.martinso.votingapp.userdetails.data.model.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostRequest {
    private UserDetails contestant;
    private Office runningPost;
    private Election election;
}
