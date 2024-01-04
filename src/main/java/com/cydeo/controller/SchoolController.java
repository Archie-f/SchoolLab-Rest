package com.cydeo.controller;

import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.TeacherDTO;
import com.cydeo.service.StudentService;
import com.cydeo.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    private final TeacherService teacherService;
    private final StudentService studentService;

    /*@GetMapping("/teachers")
    public ResponseEntity<ResponseWrapper> getTeachers(){
        return ResponseEntity.ok(
                new ResponseWrapper("Teachers retrieved successfully", teacherService.findAll())
        );
    }*/

    @GetMapping("/teachers")
    public List<TeacherDTO> getTeachers(){
        return teacherService.findAll();
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> getStudents(){
        return ResponseEntity.ok(new ResponseWrapper(
                "Students are successfully retrieved.",
                studentService.findAll()
        ));
    }


}
