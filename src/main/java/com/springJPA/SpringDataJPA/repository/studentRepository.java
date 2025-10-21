package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Student,Long> {

}
