package com.martinso.votingapp.dto;

import com.martinso.votingapp.data.model.Address;
import com.martinso.votingapp.data.model.Gender;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateUserDetailsRequest {

    private String lastname;
    private String firstname;
    private String middlename;
    private String phoneNumber;
    private String username;
    private String password;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private int age;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
    private String NIN;
    private String VIN;
}
