package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    @Column(name = "id_carro", length = 50, nullable = false)
    long id;

    @Column(name = "brand", length = 50, nullable = false)
    String brand;

    @Column(name = "model", length = 25, nullable = false)
    String model;

    @Column(name = "year", length = 4, nullable = false)
    int year;
}
