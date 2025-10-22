package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Guardian;
import com.springJPA.SpringDataJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class studentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("kanhaiya@gmail.com")
                .firstName("kanhaiya")
                .lastName("singh")
                //.guardianName("Mritasunjay")
                //.guardianEmail("mritasunjay@gmail.com")
                //.guardianMobile("5456895612")
                .build();

        studentRepository.save(student);


    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder()
                .Name("manoj")
                .Email("manoj@gmail.com")
                .Mobile("789456123")
                .build();
        Student student = Student.builder()
                .firstName("Shivam")
                .emailId("shivam@gmail.com")
                .lastName("kumar")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("StudentList : " + studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> studentList = studentRepository.findByFirstName("Shivam");

        System.out.println("StudentList : " + studentList);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> studentList = studentRepository.findByFirstNameContaining(
                "Sh");

        System.out.println("StudentList : " + studentList);
    }

}