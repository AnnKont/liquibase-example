package ru.ann.kont.liquibase.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "animal")
@EqualsAndHashCode(callSuper = true)
public class AnimalEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column
    private Long age;

    @Column(updatable = false, nullable = false)
    @Enumerated
    private AnimalType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "animal_person_fk01"))
    private PersonEntity owner;
}
