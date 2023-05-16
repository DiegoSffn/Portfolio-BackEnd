
package com.portfolio_backend.diegoS.experiencia;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ExperienciaService {
    
    private final ExperienciaRepo expRep;
    
       
    public void nuevaExperiencia(Experiencia exp){
        expRep.save(exp);
    }
    
    public void eliminarExperiencia (Long id){
        expRep.deleteById(id);
    }
    
    public List<Experiencia> listaExperiencias(){
        return expRep.findAll();
    }
    
    public Experiencia buscarExperienciaPorId(Long id){
        return expRep.findById(id).orElse(null);
    }
    
    public Experiencia editarExperiencia(Long id,Experiencia expRequest){
        
        Experiencia newExperiencia = expRep.findById(id).get();
        
        newExperiencia.setEmpresa(expRequest.getEmpresa());
        newExperiencia.setCargo(expRequest.getCargo());
        newExperiencia.setPeriodo(expRequest.getPeriodo());
        newExperiencia.setActual(expRequest.getActual());
        newExperiencia.setTipo(expRequest.getTipo());
        newExperiencia.setDescripcion(expRequest.getDescripcion());
        
        return expRep.save(newExperiencia);
    }
}
