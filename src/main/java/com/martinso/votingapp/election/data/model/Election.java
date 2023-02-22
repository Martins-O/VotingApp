package com.martinso.votingapp.election.data.model;

import com.martinso.votingapp.office.data.model.Office;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Office name;
    private LocalDate createdAt;
    private LocalDate endedAt;
}
