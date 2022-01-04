package com.blabla.springrest.rest;

import com.blabla.springrest.entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abdel
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    
    // define @PostConstruct to load student data -- only once
    
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("saif", "mohamed"));
        theStudents.add(new Student("abdelfttah", "sameeh"));
        theStudents.add(new Student("mahmoud", "adel"));
    }
    
    // define an endpoint to access "/students" - return list of students
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }
    
    // define an endpoint "/students/{studentId}" - return student at specific index
    
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        
        // check the student id 
        if ((studentId >= theStudents.size()) || (studentId < 0)){
            throw new StudentNotFoundException("student id not found - " + studentId);
        }
        
        return theStudents.get(studentId);
    }
    
}
