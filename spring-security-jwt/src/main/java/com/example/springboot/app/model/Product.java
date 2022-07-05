package com.example.springboot.app.model;


import javax.persistence.*;
import java.util.Set;


@Entity
public class Product {
    @Id
    private  long id;

    @Column(name = "surnombre")
    private  String apellido;

    @Column(name="firstname")
    private  String nombre;

    @OneToOne
    Set<Countrys> countrys;

    @ManyToMany
    Set<Languaje>  languajes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Countrys> getCountrys() {
        return countrys;
    }

    public void setCountrys(Set<Countrys> countrys) {
        this.countrys = countrys;
    }

    public Set<Languaje> getLanguajes() {
        return languajes;
    }

    public void setLanguajes(Set<Languaje> languajes) {
        this.languajes = languajes;
    }
}