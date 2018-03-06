package com.samdarshi.octusProject.controller;
import com.samdarshi.octusProject.repo.CandidateRepository;
import com.samdarshi.octusProject.vo.CandidateVo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by samdarshi on 3/3/18.
 */
@RestController
@RequestMapping("/candidates")
public class CandidateController {

    public CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @GetMapping("/all")
    public List<CandidateVo> getAll(){
        return this.candidateRepository.findAll();
    }

    @PutMapping
    public void insert(@RequestBody CandidateVo candidate){
        this.candidateRepository.insert(candidate);
    }

    @PostMapping
    public void update(@RequestBody CandidateVo candidate){
        this.candidateRepository.save(candidate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.candidateRepository.delete(id);
    }

}
