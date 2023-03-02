package com.martinso.votingapp.userdetails.dto.request;

import com.martinso.votingapp.config.PasswordMatches;
import com.martinso.votingapp.config.ValidEmail;
import com.martinso.votingapp.data.model.Address;
import com.martinso.votingapp.data.model.Gender;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@PasswordMatches
public class CreateUserDetailsRequest {
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String username;
    private String password;
    private String confirmPassword;
    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;
    private Address address;
    @Min(message = "Age is required", value = 18)
    private int age;
    private Gender gender;
    private String NIN;
    private String VIN;
}
