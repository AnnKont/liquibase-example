package ru.ann.kont.liquibase.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private OffsetDateTime createDate;

    @UpdateTimestamp
    @Column(nullable = false)
    private OffsetDateTime updateDate;
}