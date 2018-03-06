package com.samdarshi.octusProject.repo;

import com.samdarshi.octusProject.vo.CandidateVo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by samdarshi on 3/3/18.
 */
@Repository
public interface CandidateRepository extends MongoRepository<CandidateVo,String> {
    CandidateVo findById(String id);
}
