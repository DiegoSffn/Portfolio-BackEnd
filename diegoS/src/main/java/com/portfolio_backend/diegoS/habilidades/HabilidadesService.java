
package com.portfolio_backend.diegoS.habilidades;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class HabilidadesService {
    
    private final HabilidadesRepo habilRep;
    
    public void nuevaHabilidad(Habilidades hab){
        habilRep.save(hab);
    }
    
    public void eliminarHabilidad(Long id){
        habilRep.deleteById(id);
    }
    
    public List<Habilidades> listaHabilidades(){
       return habilRep.findAll();
    }
    
    public Habilidades buscarHabilidadPorId(Long id){
        return habilRep.findById(id).orElse(null);
    }
    
     public Habilidades editarHabilidad(Long id,Habilidades habRequest){
        
        Habilidades newHabilidad = habilRep.findById(id).get();
        
        newHabilidad.setNombre(habRequest.getNombre());
        newHabilidad.setPorcentaje(habRequest.getPorcentaje());
        newHabilidad.setSoft(habRequest.getSoft());
        
        return habilRep.save(newHabilidad);
    }
    
}
