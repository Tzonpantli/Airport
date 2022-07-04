package com.example.springboot.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "articulos_ropa_detalles")
public class   Product {

    @Id
    //@Column(name"")
    private long id;

    @Column(name = "idArticulo")
    private Integer idArticulos;

    @Column(name = "tipo")
    private String prendaTipo;

    @Column(name = "usabilidad")
    private String categoria;

    @Column(name = "talle")
    private String talla;

    @Column(name = "temporada")
    private String temporadaEstacion;

    @Column(name = "color")
    private String coloPrenda;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getIdArticulos() {
        return idArticulos;
    }

    public void setIdArticulos(Integer idArticulos) {
        this.idArticulos = idArticulos;
    }

    public String getPrendaTipo() {
        return prendaTipo;
    }

    public void setPrendaTipo(String prendaTipo) {
        this.prendaTipo = prendaTipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTemporadaEstacion() {
        return temporadaEstacion;
    }

    public void setTemporadaEstacion(String temporadaEstacion) {
        this.temporadaEstacion = temporadaEstacion;
    }

    public String getColoPrenda() {
        return coloPrenda;
    }

    public void setColoPrenda(String coloPrenda) {
        this.coloPrenda = coloPrenda;
    }
}