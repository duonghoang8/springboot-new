package com.example.springboot.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @Column(name = "idsubject")
    private Long idsubject;

    @Column(name = "namesubject")
    private String namesubject;


}
