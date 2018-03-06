package com.samdarshi.octusProject.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by samdarshi on 2/3/18.
 */

@Document(collection = "Candidates")
public class CandidateVo {
    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private int marks;
    private AddressVo addressVo;

    protected CandidateVo(){}

    public CandidateVo(String name, int marks, AddressVo addressVo) {
        this.name = name;
        this.marks = marks;
        this.addressVo = addressVo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public AddressVo getAddressVo() {
        return addressVo;
    }
}
