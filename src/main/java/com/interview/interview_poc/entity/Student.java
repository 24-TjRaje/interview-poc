package com.interview.interview_poc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String studentFirstName;

    private String studentLastName;

    private LocalDate studentDoB;

    private String studentContact;

    private String studentAddress;

    private Double studentHeight;

    private Double studentWeight;

    private Double studentPercentage;

    private Boolean studentIsPassed;

}
