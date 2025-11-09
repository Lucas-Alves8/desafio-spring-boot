package model;

import jakarta.persistence.*;

@Entity
@Table(name = "House")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "ownerShipStatus", length = 35, nullable = false)
    String ownerShipStatus;

    @Column(name = "location", length = 25, nullable = false)
    String location;

    @Column(name = "zipcode", length = 20, nullable = false)
    String zipcode;


}
