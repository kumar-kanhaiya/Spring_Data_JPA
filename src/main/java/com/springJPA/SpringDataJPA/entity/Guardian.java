package com.springJPA.SpringDataJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {

    @Id
    private String name ;

    @Email(message = "please insert proper emailID")
    private String email;

    @NotNull
    @NumberFormat
    @Positive
    private long mobile_no;
}
