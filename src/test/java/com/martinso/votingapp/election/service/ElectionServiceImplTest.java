package com.martinso.votingapp.election.service;

import com.martinso.votingapp.election.dto.request.ElectionRequest;
import com.martinso.votingapp.election.dto.response.ElectionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ElectionServiceImplTest {

    @Autowired
    private ElectionService electionService;

    @Test
    void testThatRegisterElectionWorks() {
        ElectionRequest request = new ElectionRequest();
        request.setElectionName("Presidential Election");
        request.setStartedAt(LocalDate.parse("2022"));
        request.setEndedAt(LocalDate.parse("2023"));
        ElectionResponse response = electionService.registerElection(request);
        assertEquals("Elections created successfully", response.getMessage());
    }


}