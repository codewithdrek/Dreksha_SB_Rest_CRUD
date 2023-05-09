package com.luv2Code.springbootRESTcrud.rest;

import com.luv2Code.springbootRESTcrud.Entity.Student;
import com.luv2Code.springbootRESTcrud.Entity.StudentErrorResponseModel;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudent;

    @GetMapping("/student")
    public List<Student> getData() {
        return theStudent;
    }

    //Define EndPoint /student/{StudentID}

    @GetMapping("/student/{studentId}")
    public Student getStudentId(@PathVariable int studentId){

         //check studentId size again
        if((studentId >= theStudent.size()) || (studentId <0)){
            throw new StudentNotFoundException("No student for this ID :"+theStudent);
        }
        return theStudent.get(studentId);
    }
    @PostConstruct
    public void loadData(){
        theStudent  =  new ArrayList<>();

        theStudent.add(new Student("ROHAN","GUPA"));
        theStudent.add(new Student("KARTIK","KAR"));
        theStudent.add(new Student("DHAR","SINGH"));
    }

    //3 step

}
