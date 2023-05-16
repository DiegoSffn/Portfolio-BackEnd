
package com.portfolio_backend.diegoS.persona;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String acerca;
    private String pitch;
    private String foto;
    private String titulo;
    private String ubicacion;
    private String email;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String acerca, String pitch, String foto, String titulo, String ubicacion, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acerca = acerca;
        this.pitch = pitch;
        this.foto = foto;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.email = email;
    }

}
