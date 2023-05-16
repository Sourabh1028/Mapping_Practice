package com.geekster.Mapping_Practice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseID;

    @Column(nullable = false)
    private String title;

    private String description;
    private String duration;

    @ManyToMany
    List<Student> studentList;



}
