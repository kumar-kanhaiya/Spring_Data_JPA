package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class studentRepositoryTest {

    @Autowired
    private studentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("kanhaiya@gmail.com")
                .firstName("kanhaiya")
                .lastName("singh")
                .guardianName("Mritasunjay")
                .guardianEmail("mritasunjay@gmail.com")
                .guardianMobile("5456895612")
                .build();

        studentRepository.save(student);


    }

    @Test
    public void printAllStudent(){

    }

}