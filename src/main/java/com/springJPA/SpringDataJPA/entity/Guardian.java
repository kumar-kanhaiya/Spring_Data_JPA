package com.springJPA.SpringDataJPA.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@AttributeOverrides(
        {
                @AttributeOverride(
                        name = "Name",
                        column = @Column(name = "guardianName")
                ) ,
                @AttributeOverride(
                        name = "Email",
                        column = @Column(name = "gurdianEmail")
                )
                ,
                @AttributeOverride(
                        name = "Mobile",
                        column = @Column(name = "gurdianMobile")
                )
        }
)
public class Guardian {


    private String Name;


    private String Email;


    private String Mobile;
}
