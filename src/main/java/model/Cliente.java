package model;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Entity
@Table (name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    long id;

    @Column(name = "nome", length = 25, nullable = false)
    String nome;

    @Column(name = "age", length = 50, nullable = false)
    int age;

    @Column(name = "dependents", length = 50, nullable = false)
    int dependents;

    @Column(name = "income", length = 50, nullable = false)
    double income;

    @Column(name = "maritalStatus", length = 50, nullable = false)
    String maritalStatus;

    @Column()
    LocalDate createdAt;



}
