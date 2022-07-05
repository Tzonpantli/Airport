package com.example.springboot.app.model;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "country")
public class Countrys {
    @Id
    private  long id;

    @Column(name = "code_country")
    private  String codCountry;

    @Column(name="name_country")
    private  String nameCountry;

    @OneToMany
    Set<Airports> airports;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodCountry() {
        return codCountry;
    }

    public void setCodCountry(String codCountry) {
        this.codCountry = codCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public Set<Airports> getAirports() {
        return airports;
    }

    public void setAirports(Set<Airports> airports) {
        this.airports = airports;
    }
}
