package com.mycompany.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository ;

    public Optional<Student> getStudent(Integer id)
    {
        return studentRepository.findById(id);
    }

    public String createStudent(Student student)
    {
        Student studentsaved = studentRepository.save(student);

        if(studentsaved == null)
            {
                return "failed save";
            }
            else
            {
                return "Saved Success" ;
            }

    }

    public List<Student> getStudents()
    {
        /* List<Student> allStudents = Arrays.asList(new Student[]
                                                    {
                                                        new Student("Amanda"),
                                                        new Student("Bob"),
                                                        new Student("Charlie")
                                                    }
                                                  ); */
        System.out.println("Enetered here *****************");
        List<Student> allStudents = studentRepository.findAll();

        System.out.println("Students are:");

        for (Student student : allStudents) {
            System.out.println(student.getName());
        }

        return allStudents;
    }
}