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
public class Recording {
    @Id
    private Long id;

    private Long course_id;

    private String link;

    private LocalDate createdAt;
}
