package com.geekster.Mapping_Practice.Controller;

import com.geekster.Mapping_Practice.Model.Student;
import com.geekster.Mapping_Practice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("{studentId}/student")
    public List<Student> getStudent(@RequestParam Long studentId){
        return studentService.getStudent(studentId);
    }

    @PutMapping("{studentId}")
    public String updateStudent(@RequestParam Long  studentId,@RequestBody Student student){
        return studentService.updateStudent(studentId,student);
    }

    @DeleteMapping(value = "/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        return studentService.deleteAddress(studentId);
    }

}
