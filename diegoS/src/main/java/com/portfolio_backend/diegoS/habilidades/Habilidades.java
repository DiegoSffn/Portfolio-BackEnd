
package com.portfolio_backend.diegoS.habilidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Habilidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private Integer porcentaje;
    private String soft;

    public Habilidades() {
    }

    public Habilidades(Long id, String nombre, Integer porcentaje, String soft) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.soft = soft;
    }

}
