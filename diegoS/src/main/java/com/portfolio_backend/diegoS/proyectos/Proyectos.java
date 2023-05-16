
package com.portfolio_backend.diegoS.proyectos;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String fotoP;
    private String git;

    public Proyectos() {
    }

    public Proyectos(Long id, String fotoP, String git) {
        this.id = id;
        this.fotoP = fotoP;
        this.git = git;
    }
    
}

