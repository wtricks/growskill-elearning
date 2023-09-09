package com.wtricks.growskill.model;

import java.time.LocalDate;

import javax.management.relation.Role;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String emailAddress;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne
    private Course course_id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate modifiedAt;
}