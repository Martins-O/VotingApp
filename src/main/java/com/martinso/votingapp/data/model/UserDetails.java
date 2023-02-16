package com.martinso.votingapp.data.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lastname;
    private String firstname;
    private String middlename;
    private String fullname;
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
    private LocalDateTime createdAt;
    @Transient
    private MultipartFile profileImage;
    @Column(name = "enabled")
    private boolean enabled;

    public UserDetails() {
        this.enabled=false;
    }
}
