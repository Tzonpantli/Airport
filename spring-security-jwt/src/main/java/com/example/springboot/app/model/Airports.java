package com.example.springboot.app.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "airport")
public class Airports {
    @Id
    private  long id;

    @Column(name = "name_airport")
    private  String nameAirport;


}
