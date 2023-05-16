
package com.portfolio_backend.diegoS.proyectos;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ProyectosService {
    
    private final ProyectosRepo proRepo;
    
    public void nuevoProyecto(Proyectos proy){
        proRepo.save(proy);
    }
    
    public void eliminarProyecto (Long id){
        proRepo.deleteById(id);
    }
    
    public List<Proyectos> listaProyectos(){
        return proRepo.findAll();
    }
    
    public Proyectos buscarProyectoPorId(Long id){
        return proRepo.findById(id).orElse(null);
    }
    
    public Proyectos editarProyecto(Long id,Proyectos proyRequest){
        
        Proyectos newProyecto = proRepo.findById(id).get();
  
        newProyecto.setFotoP(proyRequest.getFotoP());
        newProyecto.setGit(proyRequest.getGit());
        
        return proRepo.save(newProyecto);
    }
}
