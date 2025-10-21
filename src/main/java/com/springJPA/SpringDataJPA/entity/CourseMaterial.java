package com.springJPA.SpringDataJPA.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseMaterial {

    @Id
    private long courseMaterial_id;

    @NotBlank(message = "url cannot be empty")
    @URL(message = "invalid url formate")
    @Column(nullable = false , length = 2083)
    private String url;
}
