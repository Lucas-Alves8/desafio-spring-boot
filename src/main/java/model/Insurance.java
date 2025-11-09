package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Insurance")
public class Insurance {

    @Id
    long id;

    @Column(name = "type", length = 10, nullable = false)
    String type;

    @Column(name = "risk", length = 10, nullable = false)
    int risk;

    @Column(name = "analysis", length = 50, nullable = false)
    String analysis;

    @Column(name = "observation", length = 50, nullable = false)
    String observation;


}
