package com.portfolio_backend.diegoS.persona;


import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonaService {
    
    private final PersonaRepo personaRep;
    
    public void crearPersona(Persona pers){
        personaRep.save(pers);
    }
    
    public void eliminarPersona (Long id){
        personaRep.deleteById(id);
    }
    
    public List<Persona> listaPersonas(){
        return personaRep.findAll();
    }
    
    public Persona buscarPersonaPorId(Long id){
        return personaRep.findById(id).orElse(null);
    }
    
    public Persona editarPersona(Long id,Persona persRequest){
        
        Persona newPersona = personaRep.findById(id).get();
        
        newPersona.setNombre(persRequest.getNombre());
        newPersona.setApellido(persRequest.getApellido());
        newPersona.setAcerca(persRequest.getAcerca());
        newPersona.setPitch(persRequest.getPitch());
        newPersona.setFoto(persRequest.getFoto());
        newPersona.setTitulo(persRequest.getTitulo());
        newPersona.setUbicacion(persRequest.getUbicacion());
        
        return personaRep.save(newPersona);
    }
}

