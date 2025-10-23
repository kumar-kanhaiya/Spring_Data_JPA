package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Course;
import com.springJPA.SpringDataJPA.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {


    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courseList =
                    courseRepository.findAll();

        System.out.println("courses : " + courseList );
    }

    @Test
    public void saveCourseWithTeacher(){
        Course course = Course.builder()
                .title("Database")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("priyanka")
                .lastName("singh")
                .courses(List.of(course))
                .build();


    }

}