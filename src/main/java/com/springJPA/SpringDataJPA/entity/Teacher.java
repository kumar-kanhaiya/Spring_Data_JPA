    package com.springJPA.SpringDataJPA.entity;


    import jakarta.persistence.*;
    import jakarta.validation.constraints.NotBlank;
    import jakarta.validation.constraints.NotNull;
    import lombok.AllArgsConstructor;
    import lombok.Builder;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    import java.util.List;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class Teacher {

        @Id
        @SequenceGenerator(
                name = "teacher_sequence",
                sequenceName = "teacher_sequence",
                allocationSize = 1
        )
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "teacher_sequence"
        )
        private long teacherId;

        @NotBlank
        private String firstName;

        private String lastName;

        @OneToMany(
                cascade = CascadeType.ALL

        )
        @JoinColumn(
                name = "teacher_id",
                referencedColumnName = "teacherId"
        )
        private List<Course> courses;
    }
