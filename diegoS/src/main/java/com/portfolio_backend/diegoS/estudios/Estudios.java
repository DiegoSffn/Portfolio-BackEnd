
package com.portfolio_backend.diegoS.estudios;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Estudios {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;   
    @Basic
    private String titulo;
    private String institucion;
    private String logo;
    private String completo;
    private String descripcion;

    public Estudios() {
    }

    public Estudios(Long id, String titulo, String institucion, String logo, String completo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.logo = logo;
        this.completo = completo;
        this.descripcion = descripcion;
    }
    
}
