package com.example.springboot.app.model;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "languaje")
public class Languaje {
    @Id
    private  long id;

    @Column(name = "code_languaje")
    private  String codLenguaje;

    @Column(name="name_languaje")
    private  String nomLenguaje;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodLenguaje() {
        return codLenguaje;
    }

    public void setCodLenguaje(String codLenguaje) {
        this.codLenguaje = codLenguaje;
    }

    public String getNomLenguaje() {
        return nomLenguaje;
    }

    public void setNomLenguaje(String nomLenguaje) {
        this.nomLenguaje = nomLenguaje;
    }
}
