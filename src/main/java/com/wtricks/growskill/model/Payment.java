package com.wtricks.growskill.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
    @Id
    private Long id;

    private Long course_id;

    private Long user_id;

    private double amount;

    private LocalDate createdAt;
}
