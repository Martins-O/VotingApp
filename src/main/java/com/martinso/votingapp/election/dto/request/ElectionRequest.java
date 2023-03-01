package com.martinso.votingapp.election.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.martinso.votingapp.office.data.model.Office;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ElectionRequest {
    private Office electionName;
    private String startedAt;
    private String endedAt;
}
