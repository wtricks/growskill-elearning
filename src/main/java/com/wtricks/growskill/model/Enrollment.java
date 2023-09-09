package com.wtricks.growskill.model;


import com.wtricks.growskill.enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {
    @Id
    private Long id;

    private Long user_id;

    private Long course_id;

    private PaymentStatus status;
}