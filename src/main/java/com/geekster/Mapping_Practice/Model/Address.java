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
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @Column(nullable = false)
    @NotEmpty
    private String landmark;
    @Column(nullable = false)
    @NotEmpty
    private String zipcode;
    @Column(nullable = false)
    private String district;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String country;

}
