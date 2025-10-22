package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends JpaRepository<Course , Long> {

}
