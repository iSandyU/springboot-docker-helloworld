package com.mycompany.student;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class Student {
    
    @Id
    private int id ;

    private String name;
    
    private int age;

    

    public Student()
    {

    }
    

    public Student(String name)
    {
        this.name = name ;
        this.age = 25;
    }

    public Student(String name, Integer age)
    {
        this.name = name ;
        this.age = age;
    }
}