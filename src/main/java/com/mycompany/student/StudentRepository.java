package com.mycompany.student;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
    public Student findByName(String name) ;
   
}