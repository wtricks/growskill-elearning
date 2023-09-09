package com.wtricks.growskill.model;


import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    @OneToOne(mappedBy = "course_id")
    private User instrcutor_id;

    private double price;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate modifiedAt;
}