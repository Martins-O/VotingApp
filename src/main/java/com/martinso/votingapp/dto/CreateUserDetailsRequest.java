package com.martinso.votingapp.dto;

import com.martinso.votingapp.data.model.Address;
import com.martinso.votingapp.data.model.Gender;
import com.martinso.votingapp.util.regex.Validation;
import jakarta.persistence.CascadeType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateUserDetailsRequest {

    @NotBlank(message = "Lastname is required")
    private String lastname;
    @NotBlank(message = "Lastname is required")
    private String firstname;
    @NotBlank(message = "Lastname is required")
    private String middlename;
    private String phoneNumber;

    private String username;
    @Pattern(regexp = Validation.PASSWORD_PATTERN, message = "Invalid password")
    private String password;

    @Pattern(regexp = Validation.EMAIL_PATTERN,message = "Invalid email address")
    private String email;
    @Valid
    private Address address;
    @Min(message = "Age is required", value = 18)
    private int age;
    private Gender gender;
    private String NIN;
    private String VIN;
}
