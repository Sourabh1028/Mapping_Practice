package com.geekster.Mapping_Practice.Repositary;

import com.geekster.Mapping_Practice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
