package com.martinso.votingapp.vote.dto.request;

import com.martinso.votingapp.userdetails.data.model.UserDetails;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class VoteRequest {
    private UserDetails details;
    private String post;
    private LocalDateTime createdAt;
}
