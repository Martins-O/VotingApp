package com.martinso.votingapp.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private UserDetails userDetails;
    @OneToOne(cascade = CascadeType.ALL)
    private Office runningPost;
    @OneToOne(cascade = CascadeType.ALL)
    private Election election;
}
