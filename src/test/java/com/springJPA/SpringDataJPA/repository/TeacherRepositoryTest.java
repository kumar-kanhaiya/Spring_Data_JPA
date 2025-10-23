package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Course;
import com.springJPA.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){

        Course courseDSA = Course.builder()
                .title("DSA")
                .credit(6)
                .build();
        Course courseJava = Course.builder()
                .title("Java")
                .credit(5)
                .build();
        Course coursePython = Course.builder()
                .title("Python")
                .credit(8)
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Niraj")
                .lastName("Kumar")
                .courses(List.of(courseDSA , courseJava , coursePython))
                .build();

        teacherRepository.save(teacher);
    }
}