package com.example.springapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(of = {"id"})
@Entity
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int semester;
    private String program;
    private String groupName;

    public StudentGroup() {
    }

    public StudentGroup(int semester, String program, String groupName) {
        this.semester = semester;
        this.program = program;
        this.groupName = groupName;
    }
}
