
package com.portfolio_backend.diegoS.estudios;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EstudiosService {
    
    private final EstudiosRepo eduRep;
    
       
    public void nuevoEstudio(Estudios edu){
        eduRep.save(edu);
    }
    
    public void eliminarEstudio (Long id){
        eduRep.deleteById(id);
    }
    
    public List<Estudios> listaEstudios(){
        return eduRep.findAll();
    }
    
    public Estudios buscarEstudioPorId(Long id){
        return eduRep.findById(id).orElse(null);
    }
    public Estudios editarEstudio(Long id,Estudios eduRequest){
        
        Estudios newEstudios = eduRep.findById(id).get();
        
        newEstudios.setTitulo(eduRequest.getTitulo());
        newEstudios.setInstitucion(eduRequest.getInstitucion());
        newEstudios.setLogo(eduRequest.getLogo());
        newEstudios.setCompleto(eduRequest.getCompleto());
        newEstudios.setDescripcion(eduRequest.getDescripcion());
        
        
        return eduRep.save(newEstudios);
    }
}

