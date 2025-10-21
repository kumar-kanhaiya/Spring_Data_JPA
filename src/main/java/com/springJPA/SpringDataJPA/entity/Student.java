package com.springJPA.SpringDataJPA.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "email_address"
        )

        )
public class Student {

    @Id
    @Column(name = "student_id")
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "student_sequence")
    private long studentId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Email
    @Column(name = "email_address")
    @NotNull
    private String emailId;

    @Column(name = "guardian_name")
    private String guardianName;

    @Column(name = "guardian_email_address")
    private String guardianEmail;

    @Column(name = "gurdian_Mobile_no")
    private String guardianMobile;

}
