package com.martinso.votingapp.post.data.model;

import com.martinso.votingapp.office.data.model.Office;
import com.martinso.votingapp.election.data.model.Election;
import com.martinso.votingapp.userdetails.data.model.UserDetails;
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
    private UserDetails contestant;
    @OneToOne(cascade = CascadeType.ALL)
    private Office runningPost;
    @OneToOne(cascade = CascadeType.ALL)
    private Election election;
}
