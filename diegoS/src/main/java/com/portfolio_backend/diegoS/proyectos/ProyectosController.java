
package com.portfolio_backend.diegoS.proyectos;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ProyectosController {
    
    private final ProyectosService proServ;
    
    @PostMapping("proyecto")
    public void nuevoEstudio(@RequestBody Proyectos proy){
        proServ.nuevoProyecto(proy);
    }
    
    @DeleteMapping("proyecto/{id}")
    public void borrarEstudio(@PathVariable Long id){
        proServ.eliminarProyecto(id);
    }
    
    @GetMapping("proyecto")
    @ResponseBody
    public List<Proyectos> listaProyectos(){
        return proServ.listaProyectos();
    }
    
    @GetMapping("proyecto/{id}")
    @ResponseBody
    public Proyectos buscarPorId(@PathVariable Long id){
        return proServ.buscarProyectoPorId(id);
    }
    
  @PutMapping("proyecto/{id}")
  @ResponseBody
  
    public Proyectos editarProyecto(@PathVariable Long id,@RequestBody Proyectos proyRequest){
        
        return proServ.editarProyecto(id, proyRequest);
       
    } 
    
}
