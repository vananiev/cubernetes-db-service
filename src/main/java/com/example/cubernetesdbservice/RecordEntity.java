package com.example.cubernetesdbservice;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "record")
@Data
public class RecordEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "service", nullable = false)
    private String service;

    @Column(name = "word", nullable = false)
    private String word;

    @Column(name = "timestamp", nullable = false)
    private Instant timestamp = Instant.now();
}
