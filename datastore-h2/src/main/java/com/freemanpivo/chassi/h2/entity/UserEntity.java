package com.freemanpivo.chassi.h2.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "USER")
@Data
public class UserEntity {
    @Id
    private Long id;
    @Column(name = "name", length = 200, nullable = false)
    private String name;
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;
}
