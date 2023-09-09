package com.wtricks.growskill.model;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    @Id
    @GeneratedValue
    private Long id;

    private Long course_id;

    private LocalDate time;

    private String topic;

    private String zoom_link;
}