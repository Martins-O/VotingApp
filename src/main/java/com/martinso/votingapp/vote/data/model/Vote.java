package com.martinso.votingapp.vote.data.model;

import com.martinso.votingapp.userdetails.data.model.UserDetails;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private UserDetails details;
//    @OneToOne(cascade = CascadeType.ALL)
    private String post;
    private LocalDateTime createdAt;
}
