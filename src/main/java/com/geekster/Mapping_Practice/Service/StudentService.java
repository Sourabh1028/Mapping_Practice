package com.geekster.Mapping_Practice.Service;

import com.geekster.Mapping_Practice.Model.Student;
import com.geekster.Mapping_Practice.Repositary.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }


    public List<Student> getStudent(Long studentId) {
        if(studentId == null){
            return studentRepo.findAll();
        }else{
            List<Student> studentList = new ArrayList<>();
            studentList.add(studentRepo.findById(studentId).get());
            return studentList;
        }
    }

    public String updateStudent(Long studentId, Student student) {
        Optional<Student> list = studentRepo.findById(studentId);
        student.setStudentId(studentId);

        if(list.isEmpty()){
            return "student with addressId "+ studentId + " not found";
        }else{
            studentRepo.save(student);
            return "student with addressId "+ studentId + " updated successfully";
        }
    }

    public String deleteAddress(Long studentId) {
        Optional<Student> list = studentRepo.findById(studentId);

        if(list.isEmpty()){
            return "student with addressId "+ studentId + " not found";
        }else{
            studentRepo.deleteById(studentId);
            return "student with addressId "+ studentId + " deleted successfully";
        }
    }
}
