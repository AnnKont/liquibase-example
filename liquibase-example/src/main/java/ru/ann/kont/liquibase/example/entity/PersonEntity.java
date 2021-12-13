package ru.ann.kont.liquibase.example.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "person")
@EqualsAndHashCode(callSuper = true)
public class PersonEntity extends BaseEntity {

    @Column(name = "some_name")
    private String firstName;

    @Column
    private String secondName;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnimalEntity> animals = new ArrayList<>();
}
