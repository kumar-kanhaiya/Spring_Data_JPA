package com.springJPA.SpringDataJPA.repository;

import com.springJPA.SpringDataJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public List<Student>  findByFirstName(String firstName);

    public List<Student> findByFirstNameContaining(String name);

    //JPQL Query it is based on classes not on table name
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentByEmailAdd(String emailId);

}
