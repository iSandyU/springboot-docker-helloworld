package com.mycompany.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${spring.datasource.url}")
    String dbUrl;

    @RequestMapping("/students/{id}")
    private Optional<Student> getStudent(@PathVariable final Integer id)
    {
        return studentService.getStudent(id); 
    }

    @RequestMapping("/student")
    @PostMapping
    private String createStudent(@RequestParam final String name, @RequestParam final Integer age)
    {
        return studentService.createStudent(new Student(name, age)); 
    }

    @RequestMapping("/students")
    private List<Student> allStudents()
    {
        return studentService.getStudents();
    }

    @RequestMapping("/env")
    public String getEnvDetails()
    {
        return "URL is: "+dbUrl; 
    }

}