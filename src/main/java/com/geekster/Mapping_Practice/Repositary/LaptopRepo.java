package com.geekster.Mapping_Practice.Repositary;

import com.geekster.Mapping_Practice.Model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

}
