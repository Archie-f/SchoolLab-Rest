package com.cydeo.controller;

import com.cydeo.client.WeatherApiClient;
import com.cydeo.dto.AddressDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.TeacherDTO;
import com.cydeo.service.AddressService;
import com.cydeo.service.ParentService;
import com.cydeo.service.StudentService;
import com.cydeo.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    private final TeacherService teacherService;
    private final StudentService studentService;
    private final ParentService parentService;
    private final AddressService addressService;
    private final WeatherApiClient weatherApiClient;

    //TASK: Write a method for teachers and return list of teachers

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
    //***********************************************************************************************

     /* TASK: Create an endpoint for students, where json response includes
        "students are successfully retrieved." message
        code:200
        success:true
        and student data
     */

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> getStudents(){
        return ResponseEntity.ok(new ResponseWrapper(
                "Students are successfully retrieved.",
                studentService.findAll()
        ));
    }
    //***********************************************************************************************

    /* TASK: Create a parents endpoint where status code is 202
       additional header has "Parent" , "Returned"
       and following body structure
       "parents are successfully retrieved." message
       code:202
       success: true
       and parent data.
     */
    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper> getParents(){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("Parent", "Returned")
                .body(new ResponseWrapper(
                        true,
                        "Parents are retrieved successfully.",
                        HttpStatus.ACCEPTED.value(),
                        parentService.findAll()
                ));
    }
    //***********************************************************************************************

    /*  TASK: Create an endpoint for individual address information
        /address/1 2 3
        return status code 200
        "address .. is successfully retrieved" message
        success true
        and address information
     */
    @GetMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper> getAddress(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(new ResponseWrapper(
                "Address " + id + " is retrieved successfully.",
                addressService.findById(id)
        ));
    }

    //***********************************************************************************************

    /*
        HW:
        Create an endpoint to update individual address information
        return updated address directly.
    */
    @PutMapping("/address/{id}")
    public AddressDTO updateAddressData(@PathVariable("id") Long id, @RequestBody AddressDTO addressDTO) throws Exception {
        addressDTO.setId(id);
        return addressService.update(addressDTO);
    }

    @PostMapping("/teachers")
    public ResponseEntity<ResponseWrapper> createTeacher(@Valid @RequestBody TeacherDTO teacherDTO){
        TeacherDTO teacher = teacherService.createTeacher(teacherDTO);

        ResponseWrapper responseWrapper = new ResponseWrapper(true,"Teacher is created."
                ,HttpStatus.CREATED.value(),teacher);

        return ResponseEntity.status(HttpStatus.CREATED)
                .header("teacherId",String.valueOf(teacher.getId()))
                .body(responseWrapper);
    }



}
