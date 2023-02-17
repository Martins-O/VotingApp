package com.martinso.votingapp.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class LoginResponse {
    private String message;
    private boolean isSuccess;
    private Long id;
    private int code;
}
