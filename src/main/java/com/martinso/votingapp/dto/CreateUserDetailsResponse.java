package com.martinso.votingapp.dto;

import lombok.*;
import org.hibernate.annotations.Formula;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CreateUserDetailsResponse {
    private String message;
    private boolean isSuccess;
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullname;

    public CreateUserDetailsResponse(String fullname) {
        this.fullname = lastName +" "+ middleName +" "+ firstName;
    }
}
