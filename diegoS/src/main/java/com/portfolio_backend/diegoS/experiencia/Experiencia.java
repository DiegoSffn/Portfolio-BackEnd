
package com.portfolio_backend.diegoS.experiencia;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Data;


@Data
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String empresa;
    private String cargo;
    private Date periodo;
    private String actual;
    private String tipo;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String cargo, Date periodo, String actual, String tipo, String descripcion) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.periodo = periodo;
        this.actual = actual;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }
    
}
