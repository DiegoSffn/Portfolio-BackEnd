
package com.portfolio_backend.diegoS.experiencia;

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
public class ExperienciaController {
    
    public final ExperienciaService expServ;
    
    @PostMapping("experiencia")
    public void nuevaExperiencia(@RequestBody Experiencia exp){
        expServ.nuevaExperiencia(exp);
    }
    
    @DeleteMapping("experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.eliminarExperiencia(id);
    }
    
    @GetMapping("experiencia")
    public List<Experiencia> listaExperiencias(){
        return expServ.listaExperiencias();
    }
    
    @GetMapping("experiencia/{id}")
    @ResponseBody
    public Experiencia buscarPorId(@PathVariable Long id){
        return expServ.buscarExperienciaPorId(id);
    }

 @PutMapping("experiencia/{id}")
  @ResponseBody
  
    public Experiencia editarExperiencia(@PathVariable Long id,@RequestBody Experiencia expRequest){
        
        return expServ.editarExperiencia(id, expRequest);
       
    }
}
