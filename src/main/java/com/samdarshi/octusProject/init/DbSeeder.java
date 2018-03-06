package com.samdarshi.octusProject.init;

import com.samdarshi.octusProject.repo.CandidateRepository;
import com.samdarshi.octusProject.vo.AddressVo;
import com.samdarshi.octusProject.vo.CandidateVo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private CandidateRepository candidateRepository;

    public DbSeeder(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    static public CandidateVo amit = new CandidateVo(
            "Amit Samdarshi",
            98,
            new AddressVo("Singapore", "Singapore")
    );

    static public CandidateVo john = new CandidateVo(
            "John Tan",
            90,
            new AddressVo("Jakarta", "Indonesia")
    );

    static public CandidateVo smith = new CandidateVo(
            "Smith White",
            75,
            new AddressVo("Penang", "Malaysia")
    );

    @Override
    public void run(String... strings) throws Exception {
        // drop all candidates
        this.candidateRepository.deleteAll();

        //add our candidates to the database
        List<CandidateVo> candidates = Arrays.asList(amit, john, smith);
        this.candidateRepository.save(candidates);
    }
}
