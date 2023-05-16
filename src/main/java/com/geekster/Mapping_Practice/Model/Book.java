package com.geekster.Mapping_Practice.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    @NotEmpty
    private String title;
    @NotEmpty
    private String author;
    private String description;
    @NotEmpty
    private String price;

    @ManyToOne
    private Student student;
}

